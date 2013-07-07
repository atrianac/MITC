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
 * Agente que representa el conductor de tráfico
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficAreaMonitorAgent extends AgentBESA {

	public TrafficAreaMonitorAgent(String alias, TrafficAreaMonitorAgent.State state,
			StructBESA structAgent, double passwd) {
		super(alias, state, structAgent, passwd);
	}

	@Override
	public void setupAgent() {
	}

	@Override
	public void shutdownAgent() {
	}
	
	public static class State extends StateBESA {
		@Override
		public void initState(ArrayList arg0) {
		}
	}

}
