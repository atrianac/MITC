package co.edu.javeriana.traffic.mitc.guards;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.AgentBESA;
import BESA.Agent.GuardBESA;
import BESA.Agent.Event.DataBESA;
import BESA.Agent.Event.EventBESA;
import BESA.Exception.ExceptionBESA;
import co.edu.javeriana.traffic.mitc.FactoryAgents;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent.State;
import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictUtility;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.util.Constants;
import co.edu.javeriana.traffic.mitc.util.LoggerUtil;

/**
 * <p>
 * Guarda que responde ante un conflicto de cambio de linea
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class DriverControlReceiveConflictGuard extends GuardBESA {

	static final Logger logger = LoggerFactory
			.getLogger(DriverControlReceiveConflictGuard.class);

	public DriverControlReceiveConflictGuard(TrafficDriverControlAgent ag,
			String evType) {
		super(ag, evType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BESA.Agent.GuardBESA#funcExecGuard(BESA.Agent.Event.DataBESA)
	 */
	@Override
	public void funcExecGuard(DataBESA dataBesa) {

		TrafficDriverControlAgent.State st = (State) ag.getState();
		ConflictData conflictData = (ConflictData) dataBesa;

		LoggerUtil.debugConflictGuard(logger,
				"DriverControlReceiveConflictChangeLineGuard", conflictData,
				ag.getAid());

		if (st.getPercentCommunication() <= Constants.PERCENT_COMUNICATION) {
			if (st.isAvailableForConflict()) {

				LoggerUtil
						.debugTraceConflict(
								logger,
								"Bloqueando disponibilidad de conflicto DriverControlReceiveConflictChangeLineGuard",
								conflictData);

				st.setAvailableForConflict(false);

				Double myCredit = st.getCredit();
				int intentionValue = RandomUtils
						.nextInt(Constants.MAX_INTENTION_VALUE);
				int benevolenceValue = RandomUtils
						.nextInt(Constants.MAX_BENEVOLENCE_VALUE);

				Double myBeat = ConflictUtility.calculateBid(myCredit,
						intentionValue, benevolenceValue);
				ConflictData myDtCl = new ConflictData();

				try {
					BeanUtils.copyProperties(myDtCl, conflictData);
				} catch (IllegalAccessException | InvocationTargetException e1) {
				}

				myDtCl.setBid(myBeat);
				myDtCl.setReservedPoints(myCredit);
				myDtCl.setSrcIdAgent(ag.getAid());

				AgentBESA mediatorAgent = FactoryAgents.factory
						.getAgentByLongId(conflictData.getMedIdAgent());

				LoggerUtil.debugTraceConflict(logger, "agente mediador {}",
						conflictData, conflictData.getMedIdAgent());

				EventBESA ev = new EventBESA(
						MediatorResolveConflictGuard.class.getName(), myDtCl);

				try {
					LoggerUtil
							.debugTraceConflict(
									logger,
									"Enviando evento respuesta para id conflicto {}, agente mediador {}",
									conflictData, conflictData.getMedIdAgent(),
									mediatorAgent.getAid());
					mediatorAgent.sendEvent(ev);
				} catch (ExceptionBESA e) {
					logger.error(
							"error en la guarda DriverControlReceiveConflictChangeLineGuard agente MediatorReceiveConflictGuard",
							e);
				}
			} else {
				LoggerUtil.debugTraceConflict(logger,
						"Agregando a la cola de eventos", conflictData);
				st.getConflictsInQueue().add(conflictData);
			}
		} else {
			logger.debug(
					"Comunicación no Activa: DriverControlReceiveConflictGuard dt: {} simulationTime: {} iterationCount {} agente {}",
					new Object[] { conflictData.getDt(),
							conflictData.getSimulationTime(),
							conflictData.getIterationCount(), ag.getAid() });
		}
	}

}
