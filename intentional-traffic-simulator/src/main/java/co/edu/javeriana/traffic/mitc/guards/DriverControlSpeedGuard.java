package co.edu.javeriana.traffic.mitc.guards;

import BESA.Agent.GuardBESA;
import BESA.Agent.Event.DataBESA;
import co.edu.javeriana.traffic.mitc.agent.TrafficDriverControlAgent;

public class DriverControlSpeedGuard extends GuardBESA {

	public DriverControlSpeedGuard(TrafficDriverControlAgent ag, String evType) {
		super(ag, evType);
	}

	@Override
	public void funcExecGuard(DataBESA arg0) {
	}

}
