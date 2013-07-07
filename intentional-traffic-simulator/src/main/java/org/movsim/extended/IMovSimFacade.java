/**
 * 
 */
package org.movsim.extended;

import java.util.Iterator;

import javax.xml.bind.JAXBException;

import org.movsim.simulator.roadnetwork.RoadNetwork;
import org.movsim.simulator.roadnetwork.RoadSegment;
import org.movsim.simulator.trafficlights.TrafficLights;
import org.movsim.simulator.vehicles.Vehicle;
import org.movsim.simulator.vehicles.lanechange.LaneChangeModel;
import org.xml.sax.SAXException;

/**
 * <p>
 * Fachada para realizar operaciones sobre el simulador
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public interface IMovSimFacade {
	
	
	/**
	 * <p>
	 * Inicializa el simulador MovSim
	 * </p>
	 */
	void initialize() throws JAXBException, SAXException;
	
	/**
	 * <p>
	 * Ejecuta la simulación de MovSim
	 * </p>
	 */
	void runToCompletion();
	
	/**
	 * <p>
	 * Realiza el cambio de linea de un vehiculo
	 * </p>
	 * 
	 * @param vehice El vehiculo a cambiar de linea
	 * @return <code>true</code> si el vehiculo cambia de linea
	 */
	void makeChangeLine(Vehicle vehicle);
	
	/**
	 * <p>
	 * Actualiza la aceleración de un vehiculo
	 * </p>
	 * 
	 * @param vehice El vehiculo para actualizar la aceleración
	 */
	void updateAceleration(Vehicle vehice);
	
	/**
	 * <p>
	 * Actualiza la aceleración de un vehiculo
	 * </p>
	 * 
	 * @param vehice El vehiculo para actualizar la aceleración
	 */
	void updatePositionAndSpeed(Vehicle vehice);
	
	
	/**
	 * <p>
	 * Permite obtener la red de trafico
	 * </p>
	 */
	RoadNetwork getRoadNetwork();
	
	/**
	 * <p>
	 * Permite obtener los segmentos de la red de trafico
	 * </p>
	 */
	Iterator<RoadSegment> getRoadSegments();
	
	/**
	 * <p>
	 * Permite obtener los semaforos expuestos
	 * </p>
	 */
	TrafficLights getTrafficLights();
	
	
	/**
	 * <p>
	 * Permite inicializar el logger del simulador
	 * </p>
	 */
	void initializeLogger();
	
	/**
	 * <p>
	 * Permite tratar los argumentos de la simulacion
	 * </p>
	 */
	void parseArguments(String[] args);
	
	/**
	 * <p>
	 * Permite verificar si la configuracion de MovSim fue creada exiosamente
	 * </p>
	 */
	boolean notExistProjectConfigured();
	
	/**
	 * <p>
	 * Inicializa el FileAppender de MovSim
	 * </p>
	 */
	void initFileAppender();
	
	/**
	 * <p>
	 * Obtiene el timestep configurado para la simulación
	 * </p>
	 */
	double timeStep();
	
	/**
	 * <p>
	 * Determina si un vehiculo pued cambiar de linea o no
	 * </p>
	 */
	boolean determinateConflictToChangeLine(Vehicle vehicle, RoadSegment roadSegment, double dt);
	
	/**
	 * <p>
	 * Obtiene el modelo de cambio de linea
	 * </p>
	 */
	LaneChangeModel getLaneChaneModel(Vehicle vehicle);

}
