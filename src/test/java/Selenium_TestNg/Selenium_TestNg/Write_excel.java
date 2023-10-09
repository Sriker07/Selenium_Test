package Selenium_TestNg.Selenium_TestNg;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_excel {
public static void main(String[] args) throws Throwable {
		
		// TODO Auto-generated method stub
		String file_path = "E:\\Sriker_Training\\Test.xlsx";
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.getSheetAt(0);
		String cell = "Test Case";
		sheet.getRow(1).getCell(1).setCellValue(cell);
		FileOutputStream fos = new FileOutputStream(file_path);

}
}
