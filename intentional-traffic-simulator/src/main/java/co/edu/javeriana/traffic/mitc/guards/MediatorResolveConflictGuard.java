/**
 * 
 */
package co.edu.javeriana.traffic.mitc.guards;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.GuardBESA;
import BESA.Agent.Event.DataBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficMediatorAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficMediatorAgent.State;
import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictEntry;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.util.LoggerUtil;

/**
 * <p>
 * Esta guarda recibe las respuestas de los agentes ante un conflicto
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class MediatorResolveConflictGuard extends GuardBESA {

	private static final Logger logger = LoggerFactory
			.getLogger(MediatorResolveConflictGuard.class);

	public MediatorResolveConflictGuard(TrafficMediatorAgent ag, String evType) {
		super(ag, evType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BESA.Agent.GuardBESA#funcExecGuard(BESA.Agent.Event.DataBESA)
	 */
	@Override
	public void funcExecGuard(DataBESA dataBesa) {

		ConflictData conflictData = (ConflictData) dataBesa;
		TrafficMediatorAgent.State state = (State) ag.getState();

		LoggerUtil.debugConflictGuard(logger, "MediatorResolveConflictGuard",
				conflictData, ag.getAid());

		// Comprueba la disponibilidad para aceptar los agentes en el conflict
		// set
		if (state.isAvailableForConflict()) {

			ConflictEntry confEntry = state.getConflictData();

			synchronized (confEntry) {

				LoggerUtil.debugTraceConflict(logger,
						"aceptando el agente {} al conflicto {}", conflictData,
						conflictData.getSrcIdAgent(),
						conflictData.getIdConflict());

				List<ConflictData> lstConfictData = confEntry
						.getDataAgentsInCoflict();
				
				logger.debug("tamaño de conflict set {}",lstConfictData.size());

				for (ConflictData cdItem : lstConfictData) {
					if (cdItem.getSrcIdAgent().equals(
							conflictData.getSrcIdAgent())) {
						
						LoggerUtil.debugTraceConflict(logger,
								"el agente {} aceptado en el conflicto {}", conflictData,
								conflictData.getSrcIdAgent(),
								conflictData.getIdConflict());

						cdItem.setEnableToResolution(true);
						cdItem.setSrcIdAgent(conflictData.getSrcIdAgent());
						cdItem.setBid(conflictData.getBid());
						cdItem.setReservedPoints(conflictData
								.getReservedPoints());

						break;
					}
				}
			}
		}
	}

}
