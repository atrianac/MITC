/**
 * 
 */
package co.edu.javeriana.traffic.mitc.agent;

import java.util.ArrayList;

import org.movsim.extended.VehicleExtended;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.AgentBESA;
import BESA.Agent.StructBESA;
import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictState;
import co.edu.javeriana.traffic.mitc.util.Constants;

/**
 * <p>
 * Agente que representa el Driver
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficDriverControlAgent extends AgentBESA {

	private static final Logger logger = LoggerFactory
			.getLogger(TrafficDriverControlAgent.class);

	public TrafficDriverControlAgent(String alias,
			TrafficDriverControlAgent.State state, StructBESA structAgent,
			double passwd) {
		
		super(alias, state, structAgent, passwd);
		
		logger.debug("create TrafficDriverControlAgent {}" , getAid());
		state.setCredit(Constants.INITIAL_CREDIT);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BESA.Agent.AgentBESA#setupAgent()
	 */
	@Override
	public void setupAgent() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BESA.Agent.AgentBESA#shutdownAgent()
	 */
	@Override
	public void shutdownAgent() {

	}
	
	/**
	 * <p>
	 * Representa el estado del agente 
	 * </p>
	 */
	public static class State extends ConflictState {

		private VehicleExtended vehicle;

		@Override
		public void initState(ArrayList arg0) {
		}

		public VehicleExtended getVehicle() {
			return vehicle;
		}

		public void setVehicle(VehicleExtended vehicle) {
			this.vehicle = vehicle;
		}
	}

}
