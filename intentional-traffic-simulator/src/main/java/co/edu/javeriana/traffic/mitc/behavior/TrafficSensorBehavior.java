/**
 * 
 */
package co.edu.javeriana.traffic.mitc.behavior;

import BESA.Agent.BehaviorBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficSensorAgent;

/**
 * <p>
 * Agente mediador de conflicto de tráfico
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficSensorBehavior extends BehaviorBESA {

	public TrafficSensorBehavior(TrafficSensorAgent ag, String name) {
		super(ag, name);
	}

	@Override
	protected void setupBehavior() {
	}

	@Override
	protected void shutdownBehavior() {
	}

}
