/**
 * 
 */
package co.edu.javeriana.traffic.bitam.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author Alejandro
 * 
 */
public class MergeCvsToExcel {

	private static int NUM_EXPERIMENT = 5;

	private static int NUM_REPETITIONS = 10;

	private static String PATH_EXPERIMENT = "E:\\traffic-simulator\\experimentos";

	public static void main(String[] args) throws IOException {

		for (int i = 1; i <= NUM_EXPERIMENT; i++) {

			XSSFWorkbook workBook = new XSSFWorkbook();

			for (int j = 1; j <= NUM_REPETITIONS; j++) {

				XSSFSheet sheet = workBook.createSheet("" + j);

				File file = new File(PATH_EXPERIMENT + "\\" + i + "\\" + j
						+ "\\offramp-" + i + ".tt.route.csv");

				int numberRow = 0;

				System.out.println("Reader File: " + PATH_EXPERIMENT + "\\" + i
						+ "\\" + j + "\\offramp-" + i + ".tt.route.csv");

				List<String> lstCsv = FileUtils.readLines(file);

				for (String line : lstCsv) {

					XSSFRow row = sheet.createRow(numberRow);
					int numberColumn = 0;
					String[] nextLine = StringUtils.split(line, ',');

					System.out.println("Read Row: " + numberRow);

					for (String field : nextLine) {

						XSSFCell cell = row.createCell(numberColumn);
						cell.setCellValue(field);

						numberColumn++;
					}

					numberRow++;
				}
			}

			FileOutputStream fileOutputStream = new FileOutputStream(
					PATH_EXPERIMENT + "\\" + i + "\\offramp.tt.route.xlsx");
			workBook.write(fileOutputStream);
			IOUtils.closeQuietly(fileOutputStream);
		}
	}

}
