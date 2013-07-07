/**
 * 
 */
package co.edu.javeriana.traffic;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;

import javax.xml.bind.JAXBException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.LineIterator;
import org.movsim.extended.IMovSimFacade;
import org.movsim.extended.MovSimFacade;
import org.xml.sax.SAXException;

import co.edu.javeriana.traffic.mitc.FactoryAgents;

/**
 * <p>
 * Inicia el proceso de simulación para cada uno de los experimentos descritos
 * </p>
 * 
 * @author <href="mailito:f.triana@javeriana.edu.co">Alejandro Triana</href>
 * @version 1.0
 */
public class InitTrafficSimulationWithExperiments {

	private static int NUM_REPETITIONS = 1;

	private static String PATH_EXPERIMENT = "D:\\traffic-simulator\\experimentos";

	private static String[] NAME_EXPERIMENT = { "offramp.xprj",
			"offramp-2.xprj", "offramp-3.xprj", "offramp-4.xprj",
			"offramp-5.xprj", "offramp-6.xprj", "offramp-7.xprj",
			"offramp-8.xprj", "offramp-9.xprj", "offramp-10.xprj",
			"offramp-11.xprj", "offramp-12.xprj", "offramp-13.xprj",
			"offramp-14.xprj", "offramp-15.xprj" };

	private static String[] DO_EXPERIMENT = { "offramp.xprj", "offramp-2.xprj",
			"offramp-3.xprj", "offramp-4.xprj", "offramp-5.xprj",
			"offramp-6.xprj", "offramp-7.xprj", "offramp-8.xprj",
			"offramp-9.xprj", "offramp-10.xprj", "offramp-11.xprj",
			"offramp-12.xprj", "offramp-13.xprj", "offramp-14.xprj" };

	/**
	 * @param args
	 * @throws SAXException
	 * @throws JAXBException
	 */
	public static void main(String[] args) throws JAXBException, SAXException {

		int numExperiment = 0;

		Arrays.sort(DO_EXPERIMENT);

		for (String experimentName : NAME_EXPERIMENT) {
			numExperiment++;

			if (Arrays.binarySearch(DO_EXPERIMENT, experimentName) < 0) {
				for (int i = 1; i <= NUM_REPETITIONS; i++) {

					String[] argsExp = new String[] { "-f",
							PATH_EXPERIMENT + "\\" + experimentName };

					IMovSimFacade msf = MovSimFacade.instance;

					Locale.setDefault(Locale.US);

					msf.initializeLogger();
					msf.parseArguments(argsExp);

					if (msf.notExistProjectConfigured()) {
						System.err
								.println("no xml simulation configuration file provided.");
						System.exit(-1);
					}

					msf.initFileAppender();

					msf.initialize();
					FactoryAgents.factory.inicializate();

					msf.runToCompletion();

					FactoryAgents.factory.shutdownCollector();
					FactoryAgents.factory.shutdownAgents();
					FactoryAgents.factory.shutdownContainer();

					String prefixFile = null;
					Collection<File> lstFile = FileUtils.listFiles(new File(
							"./"), new String[] { "csv" }, false);

					File fRoute;
					File fRouteDir = new File(PATH_EXPERIMENT + "\\"
							+ numExperiment + "\\" + i);

					boolean isFirstFile = false;

					for (File file : lstFile) {

						if (file.getName().startsWith(
								FilenameUtils.getBaseName(experimentName)
										+ ".tt.route")
								|| file.getName().startsWith(
										FilenameUtils
												.getBaseName(experimentName)
												+ ".consumption.route")) {

							if (file.getName().startsWith(
									FilenameUtils.getBaseName(experimentName)
											+ ".tt.route")) {
								prefixFile = ".tt.route";
							} else {
								prefixFile = ".consumption.route";
							}

							fRoute = new File(PATH_EXPERIMENT + "\\"
									+ numExperiment + "\\" + i + "\\"
									+ FilenameUtils.getBaseName(experimentName)
									+ prefixFile + ".csv");

							if (!fRoute.exists()) {
								try {
									isFirstFile = true;
									FileUtils.forceMkdir(fRouteDir);
									fRoute.createNewFile();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}

							try {
								appendFiles(file, fRoute, isFirstFile);
								isFirstFile = false;
							} catch (IOException e) {
								e.printStackTrace();
							}

							try {
								FileUtils.moveFile(file,
										new File(PATH_EXPERIMENT + "\\"
												+ numExperiment + "\\" + i
												+ "\\src\\" + file.getName()));
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}
	}

	private static void appendFiles(File src, File dst, boolean writeFirstLine)
			throws IOException {

		LineIterator lIter = FileUtils.lineIterator(src);
		RandomAccessFile rFile = new RandomAccessFile(dst, "rw");

		rFile.seek(dst.length());

		long lineCount = 1;
		while (lIter.hasNext()) {
			String line = lIter.next();

			if (lineCount > 1 || writeFirstLine) {
				rFile.write((line + "\n").getBytes());
			}
			lineCount++;
		}
		lIter.close();
		rFile.close();
	}

}
