/**
 * 
 */
package org.movsim.extended;

import java.util.ArrayList;
import java.util.List;

import org.movsim.autogen.LaneChangeModelType;
import org.movsim.simulator.roadnetwork.LaneSegment;
import org.movsim.simulator.roadnetwork.Lanes;
import org.movsim.simulator.roadnetwork.RoadSegment;
import org.movsim.simulator.vehicles.Vehicle;
import org.movsim.simulator.vehicles.lanechange.LaneChangeModel;

/**
 * <p>
 * Extensión del modelo de cambio de linea. En la primera version solo permite
 * obtener los vehiculos que se encuentran en conflicto
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class ExtensionLaneChangeModel extends LaneChangeModel {

	public ExtensionLaneChangeModel(LaneChangeModelType laneChangeModelParameter) {
		super(laneChangeModelParameter);
	}

	/**
	 * <p>
	 * Permite determinar que vehiculos estan en conflicto
	 * </p>
	 */
	public List<Vehicle> getVehiclesInConflict(RoadSegment roadSegment) {

		List<Vehicle> vehiclesInConflict = new ArrayList<>();

		LaneChangeDecision lcDecision = makeDecision(roadSegment);
		int laneChangeDirection = lcDecision.getDirection();

		// Verifica si la decision efectivamente es un cambio de linea
		if (laneChangeDirection != Lanes.NO_CHANGE) {

			int currentLine = me.lane();
			int targetLine = me.lane() + laneChangeDirection;

			LaneSegment currentLineSegment = roadSegment
					.laneSegment(currentLine);
			LaneSegment targetLineSegment = roadSegment.laneSegment(targetLine);

			synchronized (currentLineSegment) {
				// Agrega los vehiculos de la actual linea destino
				vehiclesInConflict.add(currentLineSegment.frontVehicle());
				vehiclesInConflict.add(currentLineSegment.rearVehicle());
			}

			synchronized (targetLineSegment) {
				// Agrega los vehiculos de la posible linea destino
				vehiclesInConflict.add(targetLineSegment.frontVehicle());
				vehiclesInConflict.add(targetLineSegment.rearVehicle());
			}
		}

		return vehiclesInConflict;
	}
}
