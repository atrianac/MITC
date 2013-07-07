/**
 * 
 */
package co.edu.javeriana.traffic.mitc.agent.conflict;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;

import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;

/**
 * <p>
 * Clase para manejar los registros de un conflicto
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class ConflictEntry implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long idConflict;

	private List<ConflictData> dataAgentsInCoflict;

	private Timer expirateConflict;
	
	public ConflictEntry(Long idConflict,
			List<ConflictData> dataAgentsInCoflict, int t1, TimerTask resolveConflictTask) {
		
		this.idConflict = idConflict;
		this.dataAgentsInCoflict = dataAgentsInCoflict;
		
		Calendar taskDate = Calendar.getInstance();
		taskDate.add(Calendar.MILLISECOND, t1);
		
		this.expirateConflict = new Timer();
		this.expirateConflict.schedule(resolveConflictTask, taskDate.getTime());
	}

	public Long getIdConflict() {
		return idConflict;
	}

	public void setIdConflict(Long idConflict) {
		this.idConflict = idConflict;
	}

	public List<ConflictData> getDataAgentsInCoflict() {
		return dataAgentsInCoflict;
	}

	public void setDataAgentsInCoflict(List<ConflictData> dataAgentsInCoflict) {
		this.dataAgentsInCoflict = dataAgentsInCoflict;
	}
}
