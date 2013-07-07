package co.edu.javeriana.traffic.mitc.guards;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.TimerTask;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.Event.EventBESA;
import BESA.Exception.ExceptionBESA;
import co.edu.javeriana.traffic.mitc.FactoryAgents;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficMediatorAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficMediatorAgent.State;
import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictEntry;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.util.BimatrixResolverWrapper;
import co.edu.javeriana.traffic.mitc.util.Constants;
import co.edu.stanford.bimatrix.gamesolver.LHEquilibriumList;
import co.edu.stanford.bimatrix.gamesolver.LHEquilibriumProfile;

/**
 * 
 * <p>
 * Clase que permite solucionar los conflictos mediante equilibrio de Nash
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 * 
 */
public class ResolveConflictByGameTheory extends TimerTask {

	static final Logger logger = LoggerFactory
			.getLogger(ResolveConflictByGameTheory.class);

	private TrafficMediatorAgent ag;

	public ResolveConflictByGameTheory(TrafficMediatorAgent ag) {
		this.ag = ag;
	}

	@Override
	public void run() {

		// Desactiva cualquier recepcion de conflicto
		TrafficMediatorAgent.State state = (State) ag.getState();
		state.setAvailableForConflict(false);

		ConflictEntry ce = state.getConflictData();
		List<ConflictData> lstConDta = ce.getDataAgentsInCoflict();
		ConflictData conflictData = new ConflictData();

		logger.info(
				"resolviendo el conflicto para {} a traves del calculo del Equilibrio de Nash. No. Agentes {}",
				ce.getIdConflict(), lstConDta.size());

		if (lstConDta.size() > 2) {

			ConflictData cdInitAgent = lstConDta.get(0);
			ConflictData lCd = null;

			Double initialPayOff = null;
			Double lostPayOff = null;

			for (int i = 1; i < lstConDta.size(); i++) {
				ConflictData cdItemAgent = lstConDta.get(i);

				logger.info(
						"calculo del Equilibrio Nash para {} entre {} y {}",
						new Object[] { ce.getIdConflict(),
								cdInitAgent.getSrcIdAgent(),
								cdItemAgent.getSrcIdAgent() });

				LHEquilibriumList resultEquilibrium = calculateEquilibrium(
						cdInitAgent, cdItemAgent);
				LHEquilibriumProfile equilibriumProfile = resultEquilibrium
						.iterator().next();

				if (initialPayOff == null) {
					lCd = cdItemAgent;
					initialPayOff = equilibriumProfile.eq_pay1;
					lostPayOff = equilibriumProfile.eq_pay2;

					logger.debug(
							"Calculo Payoff 1 para {} entre {} y {} valores {} y {}",
							new Object[] { ce.getIdConflict(),
									cdInitAgent.getSrcIdAgent(),
									cdItemAgent.getSrcIdAgent(), initialPayOff,
									lostPayOff });

				} else {
					if (equilibriumProfile.eq_pay1 > initialPayOff) {
						lCd = cdItemAgent;
						initialPayOff = equilibriumProfile.eq_pay1;
						lostPayOff = equilibriumProfile.eq_pay2;

						logger.debug(
								"Calculo Payoff n para {} entre {} y {} valores {} y {}",
								new Object[] { ce.getIdConflict(),
										cdInitAgent.getSrcIdAgent(),
										cdItemAgent.getSrcIdAgent(),
										initialPayOff, lostPayOff });
					}
				}
			}

			String lAgent = lCd.getSrcIdAgent();

			try {
				BeanUtils.copyProperties(conflictData, lCd);
			} catch (IllegalAccessException | InvocationTargetException e) {
			}

			conflictData.setIdAgLost(lAgent);
			conflictData.setInitialPayoff(initialPayOff);
			conflictData.setLostPayoff(lostPayOff);

			logger.info(
					"enviando los eventos de resolucion final para id conflicto: {}",
					ce.getIdConflict());

			try {
				for (ConflictData cdItem : lstConDta) {

					// Solo se seleccionan los agentes que estan disponibles
					// para
					// resolver el conflicto
					if (cdItem.isEnableToResolution()) {

						TrafficDriverControlAgent agent = (TrafficDriverControlAgent) FactoryAgents.factory
								.getAgentByAlias(cdItem.getSrcIdAgent());

						logger.info(
								"enviando los eventos de resolucion final para id conflicto: {} agente: {}",
								ce.getIdConflict(), agent.getAid());

						EventBESA ev = new EventBESA(
								DriverControlReceiveConflictResolutionGuard.class.getName(), conflictData);
						try {
							agent.sendEvent(ev);
							logger.info("Despues de enviar el evento al agente {}",  agent.getAid());
						} catch (ExceptionBESA e) {
							logger.error(
									"error en la guarda ResolveConflictByGameTheory",
									e);
						}

					}
				}
			} catch (Exception e) {
				logger.error("error en la guarda ResolveConflictByGameTheory",
						e);
			}
		}
	}

	/**
	 * <p>
	 * Metodo que permite calcular el equilibrio para un par de agentes
	 * </p>
	 */
	public static LHEquilibriumList calculateEquilibrium(ConflictData initCd,
			ConflictData cd) {

		logger.info(
				"Calculo Matriz Juego para {} entre {} y {} con Ofertas {} {}",
				new Object[] { initCd.getIdConflict(), initCd.getSrcIdAgent(),
						cd.getSrcIdAgent(), initCd.getBid(), cd.getBid() });

		double[][] M1 = { { -initCd.getBid(), initCd.getBid() - cd.getBid() },
				{ initCd.getBid() + cd.getBid(), initCd.getBid() } };

		double[][] M2 = { { -cd.getBid(), cd.getBid() + initCd.getBid() },
				{ cd.getBid() - initCd.getBid(), cd.getBid() } };

		logger.info("Matriz M1 del Juego para {} entre {} y {}: {}",
				new Object[] { initCd.getIdConflict(), initCd.getSrcIdAgent(),
						cd.getSrcIdAgent(), M1 });

		logger.info("Matriz M2 del Juego para {} entre {} y {}: {}",
				new Object[] { initCd.getIdConflict(), initCd.getSrcIdAgent(),
						cd.getSrcIdAgent(), M2 });

		BimatrixResolverWrapper bw = new BimatrixResolverWrapper(Constants.M,
				Constants.N, M1, M2, Constants.BIMATRIX_GAME);

		bw.setPivot(Constants.PIVOT_1);

		LHEquilibriumList lstEquil = bw.getSingleLemkeHowson();

		if (lstEquil == null) {
			bw.setPivot(Constants.PIVOT_2);
			lstEquil = bw.getSingleLemkeHowson();
		}

		return lstEquil;
	}

}