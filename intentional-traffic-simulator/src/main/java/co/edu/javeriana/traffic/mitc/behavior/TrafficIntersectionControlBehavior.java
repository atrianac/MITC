/**
 * 
 */
package co.edu.javeriana.traffic.mitc.behavior;

import java.util.ArrayList;

import co.edu.javeriana.traffic.mitc.agent.TrafficIntersectionAgent;

import BESA.Agent.AgentBESA;
import BESA.Agent.BehaviorBESA;
import BESA.Agent.StateBESA;

/**
 * <p>
 * Representa el comportamiento de cambio de fase de un semaforo
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficIntersectionControlBehavior extends BehaviorBESA {

	public TrafficIntersectionControlBehavior(TrafficIntersectionAgent ag, String name) {
		super(ag, name);
	}

	/* (non-Javadoc)
	 * @see BESA.Agent.BehaviorBESA#setupBehavior()
	 */
	@Override
	protected void setupBehavior() {
	}

	/* (non-Javadoc)
	 * @see BESA.Agent.BehaviorBESA#shutdownBehavior()
	 */
	@Override
	protected void shutdownBehavior() {
	}
}
