/**
 * 
 */
package co.edu.javeriana.traffic.mitc.behavior;

import BESA.Agent.BehaviorBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficMediatorAgent;

/**
 * <p>
 * Representa el comportamiento para obtener informacion de tráfico por parte de un sensor
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficMediatorBehavior extends BehaviorBESA {

	public TrafficMediatorBehavior(TrafficMediatorAgent ag, String name) {
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
