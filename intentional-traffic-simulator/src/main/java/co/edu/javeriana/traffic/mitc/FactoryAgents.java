/********************************************************************
 * Copyleft. 2010
 * Pontificial Universidad Javeriana.
 * Maestria Ingenieria de Sistemas y Computacion.
 **********************************************************************/
package co.edu.javeriana.traffic.mitc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang.math.RandomUtils;

import BESA.Agent.AgentBESA;
import BESA.Agent.BehaviorBESA;
import BESA.Agent.GuardBESA;
import BESA.Agent.StateBESA;
import BESA.Agent.StructBESA;
import BESA.SystemLevel.AdmBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficAreaMonitorAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficIntersectionAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficMediatorAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficSensorAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficSupervisorAgent;
import co.edu.javeriana.traffic.mitc.behavior.TrafficAreaBehavior;
import co.edu.javeriana.traffic.mitc.behavior.TrafficDriverControlBehavior;
import co.edu.javeriana.traffic.mitc.behavior.TrafficDriverControlReceiveConflictBehavior;
import co.edu.javeriana.traffic.mitc.behavior.TrafficIntersectionControlBehavior;
import co.edu.javeriana.traffic.mitc.behavior.TrafficMediatorBehavior;
import co.edu.javeriana.traffic.mitc.behavior.TrafficSensorBehavior;
import co.edu.javeriana.traffic.mitc.behavior.TrafficSupervisorBehavior;
import co.edu.javeriana.traffic.mitc.guards.DriverControlChangeLineGuard;
import co.edu.javeriana.traffic.mitc.guards.DriverControlReceiveConflictGuard;
import co.edu.javeriana.traffic.mitc.guards.DriverControlReceiveConflictResolutionGuard;
import co.edu.javeriana.traffic.mitc.guards.DriverControlSpeedGuard;
import co.edu.javeriana.traffic.mitc.guards.IntersectionPhaseChangeGuard;
import co.edu.javeriana.traffic.mitc.guards.MediatorReceiveConflictGuard;
import co.edu.javeriana.traffic.mitc.guards.MediatorResolveConflictGuard;
import co.edu.javeriana.traffic.mitc.util.Configuration;
import co.edu.javeriana.traffic.mitc.util.Constants;

/**
 * <p>
 * Esta clase permite crear los agentes del sistema
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class FactoryAgents {

	private AdmBESA container;

	public final static FactoryAgents factory;

	private Map<String, AgentBESA> agents;
	
	private Map<String, Long> agentAliasById;

	static {
		factory = new FactoryAgents();
	}

	private FactoryAgents() {

		try {

			Configuration.setupConfiguration("traffic.properties");

			final String ipAddress = Configuration.instance
					.getString("traffic.simulation.besa.ip");
			final int rmiPort = Configuration.instance
					.getInt("traffic.simulation.besa.rmi");
			final String multicastAddress = Configuration.instance
					.getString("traffic.simulation.besa.multicast.ip");
			final int multicastPort = Configuration.instance
					.getInt("traffic.simulation.besa.multicast.port");
			
			Constants.PERCENT_COMUNICATION = Configuration.instance.getDouble("traffic.simulation.percentcommunication");

			container = AdmBESA.createInstance("traffic.contaniner",
					Constants.PASSWORD_BESA, ipAddress, rmiPort,
					multicastAddress, multicastPort, false);
			
			agents = new ConcurrentHashMap<String, AgentBESA>();
			agentAliasById = new ConcurrentHashMap<String, Long>();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * <p>
	 * Metodo que permite crear agentes a traves de su metadata
	 * </p>
	 * 
	 * @param claszAgent
	 *            . La clase del agente
	 * @param behaviors
	 *            . Los comportamientos asociados al agente
	 * @param guardsMap
	 *            . La guardas mapeadas a su respectivo comportamiento
	 * @param state
	 *            . El estado del agente
	 */
	public <T extends AgentBESA> T createAgent(
			Class<T> claszAgent,
			Map<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>> guardsMap,
			Class<? extends StateBESA> state, Long id) {

		try {

			StructBESA struct = new StructBESA();

			Set<Entry<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>>> guardsSet = guardsMap
					.entrySet();

			for (Entry<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>> guarItem : guardsSet) {
				List<Class<? extends GuardBESA>> guardsByBehavior = guarItem
						.getValue();

				struct.addBehavior(guarItem.getKey().getName());

				for (Class<? extends GuardBESA> guard : guardsByBehavior) {
					struct.bindGuard(guard.getName(), guarItem.getKey()
							.getName());
				}
			}

			AgentBESA agent = claszAgent.getConstructor(String.class, state,
					StructBESA.class, Double.TYPE).newInstance(
					claszAgent.getName() + id, state.newInstance(), struct,
					Constants.PASSWORD_BESA);

			this.agents.put(id + "", agent);
			this.agentAliasById.put(agent.getAid(), id);
			
			return (T) agent;

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * Crea un agente Monitor
	 */
	public void createTrafficAreaMonitorAgent(Long id) {
		Map<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>> maps = new HashMap<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>>();
		List<Class<? extends GuardBESA>> guards = new ArrayList<Class<? extends GuardBESA>>();

		maps.put(TrafficAreaBehavior.class, guards);

		FactoryAgents.factory.createAgent(TrafficAreaMonitorAgent.class, maps,
				TrafficAreaMonitorAgent.State.class, id);
	}

	/**
	 * Crea un agente Driver
	 */
	public TrafficDriverControlAgent createTrafficDriverControlAgent(Long id) {
		Map<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>> maps = new HashMap<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>>();
		List<Class<? extends GuardBESA>> guards = new ArrayList<Class<? extends GuardBESA>>();
		List<Class<? extends GuardBESA>> guardReceiver = new ArrayList<Class<? extends GuardBESA>>();

		guards.add(DriverControlChangeLineGuard.class);
		guards.add(DriverControlSpeedGuard.class);
		guards.add(DriverControlReceiveConflictGuard.class);
		
		guardReceiver.add(DriverControlReceiveConflictResolutionGuard.class);

		maps.put(TrafficDriverControlBehavior.class, guards);
		maps.put(TrafficDriverControlReceiveConflictBehavior.class, guardReceiver);

		return FactoryAgents.factory.createAgent(TrafficDriverControlAgent.class, maps,
				TrafficDriverControlAgent.State.class, id);
	}

	/**
	 * Crea un agente de control de interseccion
	 */
	public TrafficIntersectionAgent createTrafficIntersectionAgent(Long id) {

		Map<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>> maps = new HashMap<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>>();
		List<Class<? extends GuardBESA>> guards = new ArrayList<Class<? extends GuardBESA>>();

		guards.add(IntersectionPhaseChangeGuard.class);
		maps.put(TrafficIntersectionControlBehavior.class, guards);

		return FactoryAgents.factory.createAgent(TrafficIntersectionAgent.class, maps,
				TrafficIntersectionAgent.State.class, id);
	}

	/**
	 * Crea un agente mediador
	 */
	public TrafficMediatorAgent createTrafficMediatorAgent(Long id) {
		Map<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>> maps = new HashMap<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>>();
		List<Class<? extends GuardBESA>> guards = new ArrayList<Class<? extends GuardBESA>>();

		guards.add(MediatorReceiveConflictGuard.class);
		guards.add(MediatorResolveConflictGuard.class);

		maps.put(TrafficMediatorBehavior.class, guards);

		return FactoryAgents.factory.createAgent(TrafficMediatorAgent.class, maps,
				TrafficMediatorAgent.State.class, id);
	}

	/**
	 * Crea un agente sensor
	 */
	public void createTrafficSensorAgent(Long id) {

		Map<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>> maps = new HashMap<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>>();
		List<Class<? extends GuardBESA>> guards = new ArrayList<Class<? extends GuardBESA>>();

		maps.put(TrafficSensorBehavior.class, guards);

		FactoryAgents.factory.createAgent(TrafficSensorAgent.class, maps,
				TrafficSensorAgent.State.class, id);
	}

	/**
	 * Crea un agente supervisor
	 */
	public void createTrafficSupervisorAgent(Long id) {

		Map<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>> maps = new HashMap<Class<? extends BehaviorBESA>, List<Class<? extends GuardBESA>>>();
		List<Class<? extends GuardBESA>> guards = new ArrayList<Class<? extends GuardBESA>>();

		maps.put(TrafficSupervisorBehavior.class, guards);

		FactoryAgents.factory.createAgent(TrafficSupervisorAgent.class, maps,
				TrafficSupervisorAgent.State.class, id);
	}
	
	GarbageCollectorAgents tmsk = null;
	
	public void inicializate() {
		FactoryAgents.factory.createTrafficAreaMonitorAgent(RandomUtils.nextLong());
		FactoryAgents.factory.createTrafficMediatorAgent(RandomUtils.nextLong());
		FactoryAgents.factory.createTrafficSupervisorAgent(RandomUtils.nextLong());
		
//		Timer tm = new Timer();
//		tmsk = new GarbageCollectorAgents();
//		tm.schedule(tmsk, Constants.GARBAGE_COLLECTOR_TIME, Constants.GARBAGE_COLLECTOR_TIME);
	}
	
	public void shutdownCollector() {
		tmsk.cancel();
	}

	/**
	 * Da de baja a todos los agentes y vuelve sus instancias nulas
	 */
	public void shutdownAgents() {
		
		Set<Entry<String, AgentBESA>> sAg = this.agents.entrySet();
		
		for (Entry<String, AgentBESA> agentBesa : sAg) {
			factory.getContainer().killAgent(agentBesa.getKey(),
					Constants.PASSWORD_BESA);
		}
	}
	
	public void shutdownAgent(AgentBESA ag) {
		factory.getContainer().killAgent(ag.getAid(),Constants.PASSWORD_BESA);
	}

	/**
	 * Da de baja al contenedor
	 */
	public void shutdownContainer() {
		factory.getContainer().kill(Constants.PASSWORD_BESA);
	}

	/**
	 * @return the container
	 */
	public AdmBESA getContainer() {
		return container;
	}

	/**
	 * @param container
	 *            the container to set
	 */
	public void setContainer(AdmBESA container) {
		this.container = container;
	}
	
	/**
	 * <p>
	 * Retorna el mapa de agentes
	 * </p>
	 */
	public Map<String, AgentBESA> getAgents() {
		return agents;
	}
	
	/**
	 * <p>
	 * Retorna el agente de acuerdo a su id
	 * </p>
	 */
	public AgentBESA getAgentByLongId(Long id) {
		return this.agents.get(id + "");
	}
	
	/**
	 * <p>
	 * Retorna el agente de acuerdo a su id
	 * </p>
	 */
	public AgentBESA getAgentByAlias(String alias) {
		Long idAgent = this.getAgentAliasById().get(alias);
		return this.agents.get(idAgent + "");
	}

	/**
	 * @return the agentAliasById
	 */
	public Map<String, Long> getAgentAliasById() {
		return agentAliasById;
	}

	/**
	 * @param agentAliasById the agentAliasById to set
	 */
	public void setAgentAliasById(Map<String, Long> agentAliasById) {
		this.agentAliasById = agentAliasById;
	}

}
