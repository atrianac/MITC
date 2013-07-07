/**
 * 
 */
package co.edu.javeriana.traffic.mitc;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent.State;

import BESA.Agent.AgentBESA;

/**
 * <p>
 * Realiza la recolección de los agentes que deben eliminarse por su invalidez
 * en el proceso de simulacion
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class GarbageCollectorAgents extends TimerTask {
	
	private static final Logger logger = LoggerFactory
			.getLogger(GarbageCollectorAgents.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.TimerTask#run()
	 */
	@Override
	public void run() {
		
		logger.info("Iniciando Recoleccion Basura");
		
		Map<String, AgentBESA> agents = FactoryAgents.factory.getAgents();
		Set<Entry<String, AgentBESA>> sAgents = agents.entrySet();

		try {
			Iterator<Entry<String, AgentBESA>> iter = sAgents.iterator();
			
			while (iter.hasNext()) {
				Entry<String, AgentBESA> entryElement = iter.next();
				AgentBESA agentItem = entryElement.getValue();

				if (agentItem instanceof TrafficDriverControlAgent) {
					TrafficDriverControlAgent driverAgentItem = (TrafficDriverControlAgent) agentItem;
					TrafficDriverControlAgent.State driverAgentState = (State) driverAgentItem
							.getState();

					if (Boolean.TRUE.equals(driverAgentState.getVehicle()
							.getVehicle().getRemoved())) {
						
						logger.info("Removiendo el agente: " + driverAgentItem.getAid());
						FactoryAgents.factory.shutdownAgent(agentItem);
						iter.remove();
					}
				}
			}
			
			if(sAgents.size() == 0) {
				cancel();
			}
		
		} catch (Exception e) {
			logger.error("error: ", e);
			e.printStackTrace();
		}

	}

}
