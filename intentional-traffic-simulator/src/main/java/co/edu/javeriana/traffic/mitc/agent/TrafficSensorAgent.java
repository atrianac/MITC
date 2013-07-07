/**
 * 
 */
package co.edu.javeriana.traffic.mitc.agent;

import java.util.ArrayList;

import BESA.Agent.AgentBESA;
import BESA.Agent.StateBESA;
import BESA.Agent.StructBESA;

/**
 * <p>
 * Agente que representa un sensor del estado de tráfico
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficSensorAgent extends AgentBESA {

	public TrafficSensorAgent(String alias, TrafficSensorAgent.State state,
			StructBESA structAgent, double passwd) {
		super(alias, state, structAgent, passwd);
	}

	/* (non-Javadoc)
	 * @see BESA.Agent.AgentBESA#setupAgent()
	 */
	@Override
	public void setupAgent() {
	}

	/* (non-Javadoc)
	 * @see BESA.Agent.AgentBESA#shutdownAgent()
	 */
	@Override
	public void shutdownAgent() {
	}
	
	public static class State extends StateBESA {
		@Override
		public void initState(ArrayList arg0) {
		}
	}

}
