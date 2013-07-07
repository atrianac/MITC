/**
 * 
 */
package co.edu.javeriana.traffic.mitc.agent.conflict;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.commons.lang.math.RandomUtils;

import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;
import co.edu.javeriana.traffic.mitc.util.Constants;
import BESA.Agent.StateBESA;

/**
 * <p>
 * Clase base para manear los estados de agentes que participan en conflictos
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public abstract class ConflictState extends StateBESA {

	private static final long serialVersionUID = 1L;

	private boolean isAvailableForConflict;

	private double timeStep;

	private double credit;
	
	private Queue<ConflictData> conflictsInQueue;
	
	private double benevolence;
	
	private double percentCommunication;

	public ConflictState() {
		this.credit = Constants.INITIAL_CREDIT;
		this.conflictsInQueue = new ConcurrentLinkedQueue<>();
		this.isAvailableForConflict = true;
		this.percentCommunication = RandomUtils.nextDouble();
	}

	public boolean isAvailableForConflict() {
		return isAvailableForConflict;
	}

	public synchronized void setAvailableForConflict(
			boolean isAvailableForConflict) {
		this.isAvailableForConflict = isAvailableForConflict;
	}

	public double getTimeStep() {
		return timeStep;
	}

	public void setTimeStep(double timeStep) {
		this.timeStep = timeStep;
	}

	public Double getCredit() {
		return credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Queue<ConflictData> getConflictsInQueue() {
		return conflictsInQueue;
	}

	/**
	 * @return the benevolence
	 */
	public double getBenevolence() {
		return benevolence;
	}

	/**
	 * @param benevolence the benevolence to set
	 */
	public void setBenevolence(double benevolence) {
		this.benevolence = benevolence;
	}

	/**
	 * @return the percentCommunication
	 */
	public double getPercentCommunication() {
		return percentCommunication;
	}

	/**
	 * @param percentCommunication the percentCommunication to set
	 */
	public void setPercentCommunication(double percentCommunication) {
		this.percentCommunication = percentCommunication;
	}

}
