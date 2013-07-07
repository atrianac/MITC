package co.edu.javeriana.traffic.mitc.guards;

import co.edu.javeriana.traffic.mitc.agent.TrafficIntersectionAgent;
import BESA.Agent.AgentBESA;
import BESA.Agent.GuardBESA;
import BESA.Agent.Event.DataBESA;

/**
 * <p>
 * Representa la guarda para cambiar de fase
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class IntersectionPhaseChangeGuard extends GuardBESA {

	public IntersectionPhaseChangeGuard(TrafficIntersectionAgent ag, String evType) {
		super(ag, evType);
	}

	@Override
	public void funcExecGuard(DataBESA arg0) {
	}

}
