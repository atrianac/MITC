/**
 * 
 */
package co.edu.javeriana.traffic.bitam.util;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.LineIterator;

/**
 * @author Alejandro
 *
 */
public class MergeCVSFile {
	
	private static String PATH_EXPERIMENT = "D:\\traffic-simulator\\experimentos";
	
	private static String experimentName = "offramp-15.xprj";
	
	private static int numExperiment = 15;
	
	private static int i = 1;
	

	public static void main(String[] args) {
				
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
