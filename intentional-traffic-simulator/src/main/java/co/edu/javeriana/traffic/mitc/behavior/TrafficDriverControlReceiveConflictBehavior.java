/**
 * 
 */
package co.edu.javeriana.traffic.mitc.behavior;

import BESA.Agent.BehaviorBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;

/**
 * <p>
 * Representa el coportamiento de cambio de linea de un carro
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficDriverControlReceiveConflictBehavior extends BehaviorBESA {

	public TrafficDriverControlReceiveConflictBehavior(TrafficDriverControlAgent ag, String name) {
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
