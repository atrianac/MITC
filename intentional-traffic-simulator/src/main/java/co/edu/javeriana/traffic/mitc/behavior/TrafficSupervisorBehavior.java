/**
 * 
 */
package co.edu.javeriana.traffic.mitc.behavior;

import BESA.Agent.BehaviorBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficSensorAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficSupervisorAgent;

/**
 * <p>
 * Comportamiento para enviar información de tráfico multinivel
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficSupervisorBehavior extends BehaviorBESA {

	public TrafficSupervisorBehavior(TrafficSupervisorAgent ag, String name) {
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
