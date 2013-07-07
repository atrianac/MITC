/**
 * 
 */
package co.edu.javeriana.traffic.mitc.agent;

import java.util.ArrayList;
import java.util.List;

import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictEntry;
import co.edu.javeriana.traffic.mitc.agent.conflict.ConflictState;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;

import BESA.Agent.AgentBESA;
import BESA.Agent.StateBESA;
import BESA.Agent.StructBESA;

/**
 * <p>
 * Agente mediador de conflicto de tráfico
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficMediatorAgent extends AgentBESA {

	public TrafficMediatorAgent(String alias, TrafficMediatorAgent.State state,
			StructBESA structAgent, double passwd) {
		super(alias, state, structAgent, passwd);
		state.setAvailableForConflict(true);
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
	
	public static class State extends ConflictState {
		
		private ConflictEntry conflictData;
		
		public State() {
		}

		@Override
		public void initState(ArrayList arg0) {
		}

		public ConflictEntry getConflictData() {
			return conflictData;
		}

		public void setConflictData(ConflictEntry conflictData) {
			this.conflictData = conflictData;
		}
	}

}
