/**
 * 
 */
package org.movsim.extended;

import java.lang.reflect.Method;

import org.movsim.simulator.vehicles.Vehicle;

import co.edu.javeriana.traffic.mitc.FactoryAgents;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent.State;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * <p>
 * Intercepta las llamadas al TrafficCompositionGenerator de MovSim, permitiendo
 * crear los agentes de tráfico con referencia
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class TrafficCompositionGeneratorProxy implements MethodInterceptor {

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

		if ("createVehicle".contains(method.getName())) {

			if (returnValue instanceof Vehicle) {
				Vehicle rtrVehicle = (Vehicle) returnValue;
				
				TrafficDriverControlAgent driverAgent = FactoryAgents.factory
						.createTrafficDriverControlAgent(rtrVehicle.getId());
				
				TrafficDriverControlAgent.State stateAgent = (State) driverAgent.getState();
				stateAgent.setVehicle(new VehicleExtended(rtrVehicle));
				stateAgent.setTimeStep(0);
			}
		}

		return returnValue;
	}

}
