/**
 * 
 */
package co.edu.javeriana.traffic;

import java.util.Locale;

import javax.xml.bind.JAXBException;

import org.movsim.extended.IMovSimFacade;
import org.movsim.extended.MovSimFacade;
import org.xml.sax.SAXException;

import co.edu.javeriana.traffic.mitc.FactoryAgents;

/**
 * <p>
 * Inicia el proceso de simulación
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class InitTrafficSimulation {

	/**
	 * @param args
	 * @throws SAXException
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws JAXBException, SAXException {
		
		IMovSimFacade msf = MovSimFacade.instance;
		
		Locale.setDefault(Locale.US);

		msf.initializeLogger();
		msf.parseArguments(args);

		if (msf.notExistProjectConfigured()) {
			System.err
					.println("no xml simulation configuration file provided.");
			System.exit(-1);
		}

		msf.initFileAppender();

		msf.initialize();
		FactoryAgents.factory.inicializate();
		
		msf.runToCompletion();
	}

}
