package Selenium_TestNg.Selenium_TestNg;

import java.io.FileInputStream;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_read {

	public static void main(String[] args) throws Throwable {
		
		// TODO Auto-generated method stub
		String file_path = "E:\\Sriker_Training\\Balance Sheet by Entity.xlsx";
		
		FileInputStream input = new FileInputStream(file_path);
		
		XSSFWorkbook workbook =  new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<=rowcount;i++) {
			
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<colcount;j++) {
				XSSFCell cell  = row.getCell(j);
				
				switch(cell.getCellType()) {
				case STRING: System.out.println(cell.getStringCellValue());break;
				case NUMERIC: System.out.println(cell.getNumericCellValue());break;
				}
				
			}
			System.out.println();
		}

	}

}
