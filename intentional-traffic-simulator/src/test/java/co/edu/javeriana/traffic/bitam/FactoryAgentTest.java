/**
 * 
 */
package co.edu.javeriana.traffic.bitam;

import org.junit.Test;

import co.edu.javeriana.traffic.mitc.FactoryAgents;

/**
 * @author Alejandro
 * 
 */
public class FactoryAgentTest {
	
	@Test
	public void testFactoryAgent() throws InterruptedException {

		FactoryAgents.factory.createTrafficAreaMonitorAgent(1L);
		FactoryAgents.factory.createTrafficDriverControlAgent(1L);
		FactoryAgents.factory.createTrafficIntersectionAgent(1L);
		FactoryAgents.factory.createTrafficMediatorAgent(1L);
		FactoryAgents.factory.createTrafficSensorAgent(1L);
		FactoryAgents.factory.createTrafficSupervisorAgent(1L);
		
		Thread.sleep(20000);
	}
}
