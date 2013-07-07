/********************************************************************
 * Copyleft. 2010
 * Pontificial Universidad Javeriana.
 * Maestria Ingenieria de Sistemas y Computacion.
 **********************************************************************/
package co.edu.javeriana.traffic.mitc.util;

import org.apache.commons.lang.ArrayUtils;
import org.slf4j.Logger;

import co.edu.javeriana.traffic.mitc.agent.data.ConflictData;

/**
 * <p>
 * Clase que permite encapsular la funcionalidad de Logger
 * <p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 * 
 */
public class LoggerUtil {

	/**
	 * <p>
	 * Permite imprimir un mensaje de debug ocon parameros variables
	 * </p>
	 */
	private static void debug(Logger log, String message, Object... params) {
		log.debug(message, params);
	}

	/**
	 * <p>
	 * Imprime un mensaje de inicio de guarda
	 * </p>
	 */
	public static void debugConflictGuard(Logger log, String nameGuard,
			ConflictData conflictData, String agId) {
		debug(log,
				"ejecutando: {} dt: {} simulationTime: {} iterationCount {} agente {}",
				nameGuard, conflictData.getDt(),
				conflictData.getSimulationTime(),
				conflictData.getIterationCount(), agId);
	}

	/**
	 * <p>
	 * Imprime un mensaje de debug con parametros variables
	 * </p>
	 */
	public static void debugTraceConflict(Logger log, String message,
			ConflictData conflictData, Object... params) {

		String fMessage = "dt: {} simulationTime: {} iterationCount {} agente origen {} "
				+ message;

		Object[] paramsMessage = { conflictData.getDt(),
				conflictData.getSimulationTime(),
				conflictData.getIterationCount(), conflictData.getSrcIdAgent() };

		debug(log, fMessage, ArrayUtils.addAll(paramsMessage, params));
	}

	/**
	 * <p>
	 * Imprime un mensaje de debug con parametros variables
	 * </p>
	 */
	public static void debugTraceConflict(Logger log, String message,
			ConflictData conflictData) {

		String fMessage = "dt: {} simulationTime: {} iterationCount {} agente origen {} "
				+ message;

		Object[] paramsMessage = { conflictData.getDt(),
				conflictData.getSimulationTime(),
				conflictData.getIterationCount(), conflictData.getSrcIdAgent() };

		debug(log, fMessage, paramsMessage);
	}
}
