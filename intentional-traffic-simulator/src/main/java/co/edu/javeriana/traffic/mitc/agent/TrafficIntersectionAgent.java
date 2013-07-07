/**
 * 
 */
package co.edu.javeriana.traffic.mitc.agent;

import java.util.ArrayList;

import org.movsim.extended.TrafficLightControlGroupExtended;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.AgentBESA;
import BESA.Agent.StructBESA;
import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictState;
import co.edu.javeriana.traffic.mitc.util.Constants;

/**
 * <p>
 * Agente que representa un controlador de semaforo en una interseccion
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficIntersectionAgent extends AgentBESA {
	
	private static final Logger logger = LoggerFactory
			.getLogger(TrafficIntersectionAgent.class);

	public TrafficIntersectionAgent(String alias,
			TrafficIntersectionAgent.State state, StructBESA structAgent,
			double passwd) {
		super(alias, state, structAgent, passwd);
		
		logger.debug("create TrafficIntersectionAgent {}" , getAid());
		state.setCredit(Constants.INITIAL_CREDIT);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BESA.Agent.AgentBESA#setupAgent()
	 */
	@Override
	public void setupAgent() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BESA.Agent.AgentBESA#shutdownAgent()
	 */
	@Override
	public void shutdownAgent() {
	}

	public static class State extends ConflictState {

		private static final long serialVersionUID = 1L;

		private TrafficLightControlGroupExtended trafficLightExtended;

		@Override
		public void initState(ArrayList arg0) {
		}

		public TrafficLightControlGroupExtended getTrafficLight() {
			return trafficLightExtended;
		}

		public void setTrafficLight(
				TrafficLightControlGroupExtended trafficLight) {
			this.trafficLightExtended = trafficLight;
		}
	}

}
