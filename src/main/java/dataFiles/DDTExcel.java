package dataFiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTExcel {
	
	
	public  String getValueFromExcel(String sheetName, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\r88st\\eclipse-Testng\\BlazeProject\\TestDataExcel\\data.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		String value = w1.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
		
		
	}

}
