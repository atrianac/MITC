/**
 * 
 */
package org.movsim.extended;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import org.movsim.simulator.trafficlights.TrafficLightControlGroup;

import co.edu.javeriana.traffic.mitc.FactoryAgents;
import co.edu.javeriana.traffic.mitc.agent.TrafficIntersectionAgent;

/**
 * <p>
 * Intercepta las llamadas al TrafficLightControlGroup de MovSim, permitiendo
 * crear los agentes de tráfico para el control de semaforos con referencia
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficLightsProxy implements MethodInterceptor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.sf.cglib.proxy.MethodInterceptor#intercept(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[],
	 * net.sf.cglib.proxy.MethodProxy)
	 */
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {

		Object returnValue = proxy.invokeSuper(obj, args);

		if ("getSignalIdToController".contains(method.getName())) {

			if (returnValue instanceof Map) {
				@SuppressWarnings("unchecked")
				Map<String, TrafficLightControlGroup> rtrTrafficVehicle = (Map<String, TrafficLightControlGroup>) returnValue;
				Set<Entry<String, TrafficLightControlGroup>> setControlGroup = rtrTrafficVehicle.entrySet();
				
				for (Entry<String, TrafficLightControlGroup> cgEntry : setControlGroup) {
					TrafficIntersectionAgent driverAgent = FactoryAgents.factory
							.createTrafficIntersectionAgent(Math.round(Math.random()));
					
					TrafficIntersectionAgent.State stateAgent =  (co.edu.javeriana.traffic.mitc.agent.TrafficIntersectionAgent.State) driverAgent.getState();
					stateAgent.setTrafficLight(new TrafficLightControlGroupExtended(cgEntry.getValue()));
				}
			}
		}

		return returnValue;
	}

}
