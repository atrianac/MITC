package co.edu.javeriana.traffic.mitc.guards;

import org.apache.commons.lang.math.RandomUtils;
import org.movsim.extended.IMovSimFacade;
import org.movsim.extended.MovSimFacade;
import org.movsim.simulator.vehicles.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.GuardBESA;
import BESA.Agent.Event.DataBESA;
import BESA.Agent.Event.EventBESA;
import BESA.Exception.ExceptionBESA;
import co.edu.javeriana.traffic.mitc.FactoryAgents;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficMediatorAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent.State;
import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictUtility;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.util.Constants;

/**
 * <p>
 * Guarda que determina si un driver debe hacer un cambio de linea.
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class DriverControlChangeLineGuard extends GuardBESA {

	private static final Logger logger = LoggerFactory
			.getLogger(DriverControlChangeLineGuard.class);

	public DriverControlChangeLineGuard(TrafficDriverControlAgent ag,
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

		IMovSimFacade movSimFacade = MovSimFacade.instance;
		TrafficDriverControlAgent.State st = (State) ag.getState();
		ConflictData conflictData = (ConflictData) dataBesa;

		if (st.getPercentCommunication() <= Constants.PERCENT_COMUNICATION) {

			logger.debug(
					"ejecutando: DriverControlChangeLineGuard dt: {} simulationTime: {} iterationCount {} agente {}",
					new Object[] { conflictData.getDt(),
							conflictData.getSimulationTime(),
							conflictData.getIterationCount(), ag.getAid() });

			Vehicle srcVehicle = st.getVehicle().getVehicle();

			boolean existConflict = false;

			synchronized (conflictData.getSrcRoadSegment()) {
				existConflict = movSimFacade.determinateConflictToChangeLine(
						srcVehicle, conflictData.getSrcRoadSegment(),
						conflictData.getDt());
				logger.debug(
						"ejecutando: DriverControlChangeLineGuard dt: {} simulationTime: {} iterationCount {} agente {} existConflict {}",
						new Object[] { conflictData.getDt(),
								conflictData.getIterationCount(),
								conflictData.getIterationCount(), ag.getAid(),
								existConflict });
			}

			if (existConflict) {

				long idConflict = RandomUtils.nextLong();

				logger.debug(
						"bloqueando la disponibilidad de conflicto para el agente {} con id conflicto {}",
						ag.getAid(), idConflict);

				st.setAvailableForConflict(false);

				// Bloquea el agente para que no ingrese a ningun conflicto

				TrafficMediatorAgent mediatorAgent = FactoryAgents.factory
						.createTrafficMediatorAgent(idConflict);

				// Los factores de intencionalidad y benevolencia se obtiene
				int intentionValue = RandomUtils
						.nextInt(Constants.MAX_INTENTION_VALUE);
				int benevolenceValue = RandomUtils
						.nextInt(Constants.MAX_BENEVOLENCE_VALUE);

				Double myCredit = st.getCredit();
				Double myBid = ConflictUtility.calculateBid(myCredit,
						intentionValue, benevolenceValue);

				logger.debug("bid {}, para {}, benevolencia, {} intencion {}",
						new Object[] { myBid, ag.getAid(), benevolenceValue,
								intentionValue });

				ConflictData myDtCl = new ConflictData();

				myDtCl.setMedIdAgent(idConflict);
				myDtCl.setSrcIdAgent(ag.getAid());
				myDtCl.setBid(myBid);
				myDtCl.setSrcVehicle(srcVehicle);
				myDtCl.setIdConflict(idConflict);
				myDtCl.setDt(conflictData.getDt());
				myDtCl.setSimulationTime(conflictData.getSimulationTime());
				myDtCl.setIterationCount(conflictData.getIterationCount());
				myDtCl.setSrcRoadSegment(conflictData.getSrcRoadSegment());

				EventBESA ev = new EventBESA(
						MediatorReceiveConflictGuard.class.getName(), myDtCl);

				try {
					logger.debug(
							"eviando al evento MediatorReceiveConflictGuard para el agente {} con id conflicto {} desde la guarda {}",
							new Object[] { ag.getAid(), idConflict,
									"DriverControlChangeLineGuard" });
					mediatorAgent.sendEvent(ev);
				} catch (ExceptionBESA e) {
					logger.error(
							"error en la guarda DriverControlChangeLineGuard agente {} enviado evento MediatorReceiveConflictGuard",
							e);
				}
			}
		} else {
			logger.debug(
					"Comunicación no Activa: DriverControlChangeLineGuard dt: {} simulationTime: {} iterationCount {} agente {}",
					new Object[] { conflictData.getDt(),
							conflictData.getSimulationTime(),
							conflictData.getIterationCount(), ag.getAid() });
		}
	}
}
