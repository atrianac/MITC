/**
 * 
 */
package org.movsim.extended;

import java.io.Serializable;

import org.movsim.simulator.trafficlights.TrafficLightControlGroup;

/**
 * <p>
 * Objeto que extiende la clase {@link TrafficLightControlGroup} de MovSim
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficLightControlGroupExtended implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private TrafficLightControlGroup trafficLightControlGroup;
	
	public TrafficLightControlGroupExtended(TrafficLightControlGroup trafficLight) {
		this.trafficLightControlGroup = trafficLight;
	}

	public TrafficLightControlGroup getTrafficLight() {
		return trafficLightControlGroup;
	}

	public void setTrafficLight(TrafficLightControlGroup trafficLight) {
		this.trafficLightControlGroup = trafficLight;
	}
}
