package Generic_Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public interface FrameWorkConstants1 {

	//String excel_Path="./src/test/resources/TestData/ExcelFile.xlxs";
	String excel_Path=".\\TestData\\C:\\ShopperstackProject\\ExcelSS";
	String properties_Path="./src/test/resources/TestData/PropertiesFile.properties";
	String screenShot_Path="./Screenshots/";
	
	String url_Key="url";
	String email_Key="email";
	String password_Key="password";
	
	long implicitWait_Time=10;
	long explicitWait_Time=10;
}
	


/*		File file=new File(".\\TestData\\C:\\ShopperstackProject\\ExcelSS");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet=workbook.getSheet("sheet1");
		
		int row_num=sheet.getPhysicalNumberOfRows();
		int col_num=sheet.getRow(0).getPhysicalNumberOfCells();
		//Create a 2-D array of the same size as excel sheet
		
		String[][] data=new String[row_num][col_num] ;
		for(int i=0; i<row_num;i++) {
			for(int j=0;j<col_num; j++) {
			System.out.print(sheet.getRow(i).getCell(j).toString()+"");	
			}
			System.out.println();
			
		
		
	*/
	
	
	
