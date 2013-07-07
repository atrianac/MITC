package co.edu.javeriana.traffic.mitc.guards;

import org.movsim.extended.IMovSimFacade;
import org.movsim.extended.MovSimFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.GuardBESA;
import BESA.Agent.Event.DataBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent.State;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.util.LoggerUtil;

/**
 * <p>
 * Guarda que recibir la respuesta del final del conflicto
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class DriverControlReceiveConflictResolutionGuard extends GuardBESA {

	private static final Logger logger = LoggerFactory
			.getLogger(DriverControlReceiveConflictResolutionGuard.class);

	public DriverControlReceiveConflictResolutionGuard(
			TrafficDriverControlAgent ag, String evType) {
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
		ConflictData srcDtCl = (ConflictData) dataBesa;

		LoggerUtil.debugConflictGuard(logger,
				"DriverControlReceiveConflictResolutionGuard", srcDtCl,
				ag.getAid());

		st.setAvailableForConflict(true);

		if (srcDtCl.getIdAgLost().equals(ag.getAid())) {
			st.setCredit(st.getCredit() + srcDtCl.getLostPayoff());
		}
		
		if (srcDtCl.getSrcIdAgent().equals(ag.getAid())) {
			st.setCredit(st.getCredit() + srcDtCl.getInitialPayoff());
			IMovSimFacade movSimFacade = MovSimFacade.instance;
			
			movSimFacade.makeChangeLine(st.getVehicle().getVehicle());
			
		}
		
	}

}
