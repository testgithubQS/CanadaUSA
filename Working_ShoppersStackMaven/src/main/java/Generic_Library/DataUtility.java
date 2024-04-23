package Generic_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {

	public static void main(String[] args) {
		FileInputStream fis;
		Properties pobj;
		Workbook book;
		Sheet sheet;
	}

		public String getDataFromProperties(String key) throws IOException {
			String properties_Path = (null);
			FileInputStream fis = new FileInputStream(properties_Path);
			Properties pobj = new Properties();
			pobj.load(fis);
			return pobj.getProperty(key);
		}

		public String getDataFromExcel(String sheetName, int rowNum, int cellNum)
				throws EncryptedDocumentException, IOException {
			FileInputStream fis = new FileInputStream("./TestData/TestDataSS.xlsx");
			 Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet(sheetName);
			return sheet.getRow(rowNum).getCell(cellNum).toString();
		}

		public Object[][] getAllDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException{
			FileInputStream fis = new FileInputStream("./TestData/TestDataSS.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet(sheetName);
			int row_count = sheet.getPhysicalNumberOfRows();
			int col_count = sheet.getRow(0).getPhysicalNumberOfCells();

			Object[][] data = new Object[row_count - 1][col_count];

			for (int r = 1; r < row_count; r++) {
				Row row = sheet.getRow(r);
				for (int c = 0; c < row.getLastCellNum(); c++) {
					data[r - 1][c] = row.getCell(c).toString();
				}
			}
			return data;
		}
	}
	

	
