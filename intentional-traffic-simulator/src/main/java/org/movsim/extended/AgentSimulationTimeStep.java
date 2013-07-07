/**
 * 
 */
package org.movsim.extended;

import java.util.Iterator;

import org.movsim.simulator.SimulationTimeStep;
import org.movsim.simulator.roadnetwork.LaneSegment;
import org.movsim.simulator.roadnetwork.RoadSegment;
import org.movsim.simulator.vehicles.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import BESA.Agent.AgentBESA;
import BESA.Agent.Event.EventBESA;
import BESA.Exception.ExceptionBESA;
import co.edu.javeriana.traffic.mitc.FactoryAgents;
import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.guards.DriverControlChangeLineGuard;
import co.edu.javeriana.traffic.mitc.util.Constants;

/**
 * <p>
 * Clase para ejecutar el proceso de simulacion de agentes antes de cualquier
 * ejecucion de MovSim
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class AgentSimulationTimeStep implements SimulationTimeStep {

	private static final Logger logger = LoggerFactory
			.getLogger(AgentSimulationTimeStep.class);

	private int step;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.movsim.simulator.SimulationTimeStep#timeStep(double, double,
	 * long)
	 */
	@Override
	public void timeStep(double dt, double simulationTime, long iterationCount) {

		step++;

		if (step == Constants.TIME_STEP) {

			logger.debug(
					"ejecutando: AgentSimulationTimeStep dt: {} simulationTime: {} iterationCount {}",
					new Object[] { new Double(dt), new Double(simulationTime),
							new Long(iterationCount) });

			step = 0;

			IMovSimFacade movSimFac = MovSimFacade.instance;
			Iterator<RoadSegment> iterRoadSegments = movSimFac
					.getRoadSegments();

			while (iterRoadSegments.hasNext()) {

				RoadSegment roadSegment = (RoadSegment) iterRoadSegments.next();
				
				synchronized (roadSegment) {
					Iterable<LaneSegment> laneSegments = roadSegment
							.laneSegments();

					for (LaneSegment laneSegment : laneSegments) {

						for (Vehicle vehicle : laneSegment) {

							ConflictData myDtCl = new ConflictData();
							myDtCl.setDt(dt);
							myDtCl.setSimulationTime(simulationTime);
							myDtCl.setIterationCount(iterationCount);
							myDtCl.setSrcRoadSegment(roadSegment);

							AgentBESA dAgentItem = FactoryAgents.factory
									.getAgentByLongId(vehicle.getId());

							EventBESA ev = new EventBESA(
									DriverControlChangeLineGuard.class
											.getName(),
									myDtCl);
							try {
								dAgentItem.sendEvent(ev);
							} catch (ExceptionBESA e) {
								logger.error(
										"error en la guarda DriverControlChangeLineGuard en AgentSimulationTimeStep",
										e);
							}
						}
					}
				}
			}

			logger.debug("ejecutando: AgentSimulationTimeStep final");
		}
	}

}
