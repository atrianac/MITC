/**
 * 
 */
package org.movsim.extended;

import java.io.Serializable;

import org.movsim.simulator.vehicles.Vehicle;

/**
 * <p>
 * Objeto que extiende la clase {@link Vehicle} de MovSim
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class VehicleExtended implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Vehicle vehicle;
	
	public VehicleExtended(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

}
