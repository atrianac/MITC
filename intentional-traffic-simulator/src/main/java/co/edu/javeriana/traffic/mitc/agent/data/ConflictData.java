/**
 * 
 */
package co.edu.javeriana.traffic.mitc.agent.data;

import org.movsim.simulator.roadnetwork.RoadSegment;
import org.movsim.simulator.vehicles.Vehicle;

import BESA.Agent.Event.DataBESA;

/**
 * <p>
 * Clase para los datos de un conflicto de trafico
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class ConflictData extends DataBESA {
	
	private static final long serialVersionUID = 1L;

	private String srcIdAgent;
	
	private Long medIdAgent;
	
	private String idAgLost;
	
	private Double bid;
	
	private Double reservedPoints;
	
	private boolean enableToResolution;
	
	private Double dt;
	
	private Double simulationTime;
	
	private Long iterationCount;
	
	private RoadSegment srcRoadSegment;
	
	private Vehicle srcVehicle;
	
	private Long idConflict;
	
	private Double initialPayoff;
	
	private Double lostPayoff;
	
	
	/* (non-Javadoc)
	 * @see BESA.Agent.Event.DataBESA#strToDataBesa(java.lang.String)
	 */
	@Override
	public void strToDataBesa(String paramString) {
	}

	public String getSrcIdAgent() {
		return srcIdAgent;
	}

	public void setSrcIdAgent(String srcIdAgent) {
		this.srcIdAgent = srcIdAgent;
	}

	public Long getMedIdAgent() {
		return medIdAgent;
	}

	public void setMedIdAgent(Long medIdAgent) {
		this.medIdAgent = medIdAgent;
	}

	public Double getBid() {
		return bid;
	}

	public void setBid(Double utility) {
		this.bid = utility;
	}

	public Double getReservedPoints() {
		return reservedPoints;
	}

	public void setReservedPoints(Double accumulatyCost) {
		this.reservedPoints = accumulatyCost;
	}

	public synchronized boolean isEnableToResolution() {
		return enableToResolution;
	}

	public synchronized void setEnableToResolution(boolean enableToResolution) {
		this.enableToResolution = enableToResolution;
	}

	public String getIdAgLost() {
		return idAgLost;
	}

	public void setIdAgLost(String idAgLost) {
		this.idAgLost = idAgLost;
	}

	/**
	 * @return the dt
	 */
	public Double getDt() {
		return dt;
	}

	/**
	 * @param dt the dt to set
	 */
	public void setDt(Double dt) {
		this.dt = dt;
	}

	/**
	 * @return the simulationTime
	 */
	public Double getSimulationTime() {
		return simulationTime;
	}

	/**
	 * @param simulationTime the simulationTime to set
	 */
	public void setSimulationTime(Double simulationTime) {
		this.simulationTime = simulationTime;
	}

	/**
	 * @return the iterationCount
	 */
	public Long getIterationCount() {
		return iterationCount;
	}

	/**
	 * @param iterationCount the iterationCount to set
	 */
	public void setIterationCount(Long iterationCount) {
		this.iterationCount = iterationCount;
	}

	/**
	 * @return the srcRoadSegment
	 */
	public RoadSegment getSrcRoadSegment() {
		return srcRoadSegment;
	}

	/**
	 * @param srcRoadSegment the srcRoadSegment to set
	 */
	public void setSrcRoadSegment(RoadSegment srcRoadSegment) {
		this.srcRoadSegment = srcRoadSegment;
	}

	/**
	 * @return the srcVehicle
	 */
	public void setSrcVehicle(Vehicle vehicle) {
		this.srcVehicle = vehicle;
	}

	/**
	 * @return the srcVehicle
	 */
	public Vehicle getSrcVehicle() {
		return srcVehicle;
	}

	/**
	 * @return the idConflict
	 */
	public Long getIdConflict() {
		return idConflict;
	}

	/**
	 * @param idConflict the idConflict to set
	 */
	public void setIdConflict(Long idConflict) {
		this.idConflict = idConflict;
	}

	/**
	 * @return the initialPayoff
	 */
	public Double getInitialPayoff() {
		return initialPayoff;
	}

	/**
	 * @param initialPayoff the initialPayoff to set
	 */
	public void setInitialPayoff(Double initialPayoff) {
		this.initialPayoff = initialPayoff;
	}

	/**
	 * @return the lostPayoff
	 */
	public Double getLostPayoff() {
		return lostPayoff;
	}

	/**
	 * @param lostPayoff the lostPayoff to set
	 */
	public void setLostPayoff(Double lostPayoff) {
		this.lostPayoff = lostPayoff;
	}
}
