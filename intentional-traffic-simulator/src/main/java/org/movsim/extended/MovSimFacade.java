/**
 * 
 */
package org.movsim.extended;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.movsim.input.MovsimCommandLine;
import org.movsim.input.ProjectMetaData;
import org.movsim.logging.LogFileAppender;
import org.movsim.logging.Logger;
import org.movsim.simulator.roadnetwork.RoadNetwork;
import org.movsim.simulator.roadnetwork.RoadSegment;
import org.movsim.simulator.trafficlights.TrafficLights;
import org.movsim.simulator.vehicles.Vehicle;
import org.movsim.simulator.vehicles.lanechange.LaneChangeModel;
import org.xml.sax.SAXException;

/**
 * <p>
 * Implementacion de la llamada de MovSim
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class MovSimFacade implements IMovSimFacade {

	public static final MovSimFacade instance;

	private SimulatorExtended simulatorExtented;

	private List<Vehicle> vehicles;

	static {
		instance = new MovSimFacade();
	}

	private MovSimFacade() {
		simulatorExtented = new SimulatorExtended();
		vehicles = new ArrayList<>();
	}

	@Override
	public void initialize() throws JAXBException, SAXException {
		simulatorExtented.initialize();
		simulatorExtented.addTimeStep(new AgentSimulationTimeStep(), 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.movsim.extended.IMovSimFacade#considerLaneChange(org.movsim.simulator
	 * .vehicles.Vehicle)
	 */
	@Override
	public void makeChangeLine(Vehicle vehicle) {
		vehicle.setChangeLine(true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.movsim.extended.IMovSimFacade#updateAceleration(org.movsim.simulator
	 * .vehicles.Vehicle)
	 */
	@Override
	public void updateAceleration(Vehicle vehice) {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.movsim.extended.IMovSimFacade#updatePositionAndSpeed(org.movsim.simulator
	 * .vehicles.Vehicle)
	 */
	@Override
	public void updatePositionAndSpeed(Vehicle vehice) {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.extended.IMovSimFacade#getRoadNetwork()
	 */
	@Override
	public RoadNetwork getRoadNetwork() {
		return simulatorExtented.getRoadNetwork();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.extended.IMovSimFacade#getTrafficLights()
	 */
	@Override
	public TrafficLights getTrafficLights() {
		return simulatorExtented.getTrafficLights();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.extended.IMovSimFacade#getRoadSegments()
	 */
	@Override
	public Iterator<RoadSegment> getRoadSegments() {
		return getRoadNetwork().iterator();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.extended.IMovSimFacade#initializeLogger()
	 */
	@Override
	public void initializeLogger() {
		Logger.initializeLogger();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.extended.IMovSimFacade#parseArguments(java.lang.String[])
	 */
	@Override
	public void parseArguments(String[] args) {
		MovsimCommandLine.parse(args);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.extended.IMovSimFacade#existProjectConfigured()
	 */
	@Override
	public boolean notExistProjectConfigured() {
		return !ProjectMetaData.getInstance().hasProjectName();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.extended.IMovSimFacade#runToCompletion()
	 */
	@Override
	public void runToCompletion() {
		simulatorExtented.runToCompletion();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.extended.IMovSimFacade#initFileAppender()
	 */
	@Override
	public void initFileAppender() {
		LogFileAppender.initialize(ProjectMetaData.getInstance());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.extended.IMovSimFacade#timeStep()
	 */
	@Override
	public double timeStep() {
		return simulatorExtented.getTimeStep();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.movsim.extended.IMovSimFacade#determinateConflictToChangeLine(org
	 * .movsim.simulator.vehicles.Vehicle)
	 */
	@Override
	public boolean determinateConflictToChangeLine(Vehicle vehicle,
			RoadSegment roadSegment, double dt) {
		return vehicle.considerLaneChange(dt, roadSegment);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.movsim.extended.IMovSimFacade#getLaneChaneModel(org.movsim.simulator
	 * .vehicles.Vehicle)
	 */
	@Override
	public LaneChangeModel getLaneChaneModel(Vehicle vehicle) {
		return vehicle.getLaneChangeModel();
	}
}
