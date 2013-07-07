/**
 * 
 */
package co.edu.javeriana.traffic.mitc.guards;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.AgentBESA;
import BESA.Agent.GuardBESA;
import BESA.Agent.Event.DataBESA;
import BESA.Agent.Event.EventBESA;
import BESA.Exception.ExceptionBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficMediatorAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficMediatorAgent.State;
import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictEntry;
import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictUtility;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.util.Constants;
import co.edu.javeriana.traffic.mitc.util.LoggerUtil;

/**
 * <p>
 * Guarda que recibe el inicio de un conflicto y realiza la propagacion
 * respectiva a los agentes en el conflict set
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class MediatorReceiveConflictGuard extends GuardBESA {

	static final Logger logger = LoggerFactory
			.getLogger(MediatorReceiveConflictGuard.class);

	public MediatorReceiveConflictGuard(TrafficMediatorAgent ag, String evType) {
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

		LoggerUtil.debugConflictGuard(logger, "MediatorReceiveConflictGuard",
				conflictData, ag.getAid());

		List<AgentBESA> conflictSet = null;

		synchronized (conflictData.getSrcRoadSegment()) {

			LoggerUtil.debugTraceConflict(logger,
					"Determinando Conflict Set para id conflicto {}",
					conflictData, conflictData.getIdConflict());

			conflictSet = ConflictUtility.determinateConflictSetToChangeLine(
					conflictData.getSrcVehicle(),
					conflictData.getSrcRoadSegment());
		}

		List<ConflictData> csConflictData = new ArrayList<>();

		ConflictEntry cEntry = new ConflictEntry(conflictData.getIdConflict(),
				csConflictData, Constants.CONFLICT_STATE_DURATION,
				new ResolveConflictByGameTheory((TrafficMediatorAgent) ag));

		state.setConflictData(cEntry);

		// Se agrega el agente origen al Conflict Data
		csConflictData.add(0, conflictData);

		// Se realiza el evento multidifusion a todos los agentes dentro del
		// conflict -set
		for (AgentBESA agent : conflictSet) {

			ConflictData cd = new ConflictData();

			try {
				BeanUtils.copyProperties(cd, conflictData);
			} catch (IllegalAccessException | InvocationTargetException e1) {
			}

			cd.setMedIdAgent(conflictData.getMedIdAgent());
			cd.setSrcIdAgent(agent.getAid());
			csConflictData.add(cd);

			LoggerUtil
					.debugTraceConflict(
							logger,
							"Enviando evento multidifusion para id conflicto {}, agente destino {}",
							conflictData, conflictData.getIdConflict(),
							agent.getAid());

			EventBESA ev = new EventBESA(
					DriverControlReceiveConflictGuard.class.getName(), cd);

			try {
				agent.sendEvent(ev);
			} catch (ExceptionBESA e) {
				logger.error(
						"error en la guarda MediatorReceiveConflictGuard agente MediatorReceiveConflictGuard",
						e);
			}
		}

	}
}
