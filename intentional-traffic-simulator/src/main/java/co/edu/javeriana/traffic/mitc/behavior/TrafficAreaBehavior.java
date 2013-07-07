/**
 * 
 */
package co.edu.javeriana.traffic.mitc.behavior;

import BESA.Agent.BehaviorBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficAreaMonitorAgent;

/**
 * <p>
 * Comportamiento para recibir información de tráfico multinivel
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficAreaBehavior extends BehaviorBESA {

	public TrafficAreaBehavior(TrafficAreaMonitorAgent ag, String name) {
		super(ag, name);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BESA.Agent.BehaviorBESA#setupBehavior()
	 */
	@Override
	protected void setupBehavior() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see BESA.Agent.BehaviorBESA#shutdownBehavior()
	 */
	@Override
	protected void shutdownBehavior() {
	}

}
