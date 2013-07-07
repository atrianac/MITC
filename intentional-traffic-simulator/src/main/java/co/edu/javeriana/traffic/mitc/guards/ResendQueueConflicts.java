package co.edu.javeriana.traffic.mitc.guards;

import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.AgentBESA;
import BESA.Agent.Event.EventBESA;
import BESA.Exception.ExceptionBESA;
import co.edu.javeriana.traffic.mitc.FactoryAgents;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent.State;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.util.LoggerUtil;

/**
 * <p>
 * Clase que permite re-enviar la respuesta sobre los conflictos encolados
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class ResendQueueConflicts extends TimerTask {

	static final Logger logger = LoggerFactory
			.getLogger(ResendQueueConflicts.class);

	private TrafficDriverControlAgent ag;

	public ResendQueueConflicts(TrafficDriverControlAgent ag) {
		this.ag = ag;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {
		TrafficDriverControlAgent.State state = (State) ag.getState();
		ConflictData conflictData = state.getConflictsInQueue().poll();
		
		LoggerUtil.debugTraceConflict(logger, "ResendQueueConflicts para {}",
				conflictData, conflictData.getIdConflict());
		
		AgentBESA dAgentItem = FactoryAgents.factory.getAgentByLongId(conflictData
				.getSrcVehicle().getId());

		EventBESA ev = new EventBESA(
				DriverControlChangeLineGuard.class.getName(), conflictData);
		try {
			dAgentItem.sendEvent(ev);
		} catch (ExceptionBESA e) {
			logger.error("error en el re-envio ResendQueueConflicts", e);
		}

	}
}