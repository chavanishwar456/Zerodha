package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {
public static String getData( String Sheetname,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("F:\\Music\\Automation\\27th feb\\KiteZerodha\\src\\test\\resources\\kite excel.xlsx");
	String value = WorkbookFactory.create(file).getSheet("kite excel").getRow(row).getCell(cell).getStringCellValue();
	return value;
}
}
