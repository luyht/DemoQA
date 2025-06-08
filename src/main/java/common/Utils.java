package common;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utils {

	public String[][] readDataFromExcelFile(String fileName, String sheetName){
		String[][] dataTable=null;
		String excelFile = System.getProperty("user.dir") + "\\testcase\\testdata\\" + fileName;
		try {
			FileInputStream file =new FileInputStream(new File(excelFile));
			 Workbook workbook = WorkbookFactory.create(file);
			// Sheet sheet = workbook.getSheet(sheetName); 
			 
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return dataTable;
	}
}
