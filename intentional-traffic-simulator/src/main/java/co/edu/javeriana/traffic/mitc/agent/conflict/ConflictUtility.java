/**
 * 
 */
package co.edu.javeriana.traffic.mitc.agent.conflict;

import java.util.ArrayList;
import java.util.List;

import org.movsim.simulator.roadnetwork.RoadSegment;
import org.movsim.simulator.vehicles.Vehicle;
import org.movsim.simulator.vehicles.lanechange.LaneChangeModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.AgentBESA;
import co.edu.javeriana.traffic.mitc.FactoryAgents;

/**
 * <p>
 * Utilidad para el manejo de conflictos
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public abstract class ConflictUtility {

	public static Logger logger = LoggerFactory
			.getLogger(ConflictUtility.class);

	/**
	 * <p>
	 * Permite calcular la utilidad de un agente
	 * </p>
	 * 
	 * @param credit
	 *            . El costo reservado del agente
	 * @param bidIntention
	 *            . La utilidad ofrecida por el agente origen
	 * @param benevolence
	 *            La benevolencia del agente
	 */
	public static Double calculateBid(double credit, double bidIntention,
			double benevolence) {

		double beat = 0.0;

		beat = (bidIntention * benevolence) * (1 / credit);

		return beat;
	}

	/**
	 * <p>
	 * Determina los agentes que estan en conflicto segun los vehiculos
	 * </p>
	 * 
	 * @param myReserveCost
	 *            . El costo reservado del agente
	 * @param srcUtility
	 *            . La utilidad ofrecida por el agente origen
	 */
	public static List<AgentBESA> determinateConflictSetToChangeLine(
			Vehicle vehicle, RoadSegment roadSegment) {

		LaneChangeModel lm = vehicle.getLaneChangeModel();
		List<AgentBESA> agInConflict = new ArrayList<>();

		List<Vehicle> vhInConflict = lm.getVehiclesInConflict(roadSegment);

		for (Vehicle vhItem : vhInConflict) {
			if (vhItem != null) {
				synchronized (vhItem) {
					if (vhItem.getId() != vehicle.getId()) {
						logger.debug("Vehiculo en el conflicto {}",
								vhItem.getId());
						agInConflict.add(FactoryAgents.factory
								.getAgentByLongId(vhItem.getId()));
					}
				}

			}
		}

		return agInConflict;
	}

}
