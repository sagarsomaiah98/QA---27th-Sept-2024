import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class WriteToExcel {
	
	//https://poi.apache.org/components/spreadsheet/quick-guide.html#NewWorkbook

	public static void main(String[] args) throws IOException {
		

 Workbook wb = new HSSFWorkbook();

try  (OutputStream fileOut = new FileOutputStream("S:\\JANBASK\\QA - 27th Sept 2024\\QA Class 31 Data Parameterization\\src\\TestSuite\\Test.xls")) {
	Sheet s1 = wb.createSheet("Sheet A");
	Sheet s2 = wb.createSheet("Sheet B");
	Sheet s3 = wb.createSheet("Sheet C");
	
	//two  rows
	Row r0 = s1.createRow(0);
	Row r1 = s1.createRow(1);
		
	
	//create three columns in row 0
	Cell c0 = r0.createCell(0);
	Cell c1 = r0.createCell(1);
	Cell c2 = r0.createCell(2);
	
	//create three columns in row 1
	Cell c01 = r1.createCell(0);
	Cell c02 = r1.createCell(1);
	Cell c03 = r1.createCell(2);
	

	
	c0.setCellValue("First");
	c1.setCellValue("Second");
	c2.setCellValue("Third");
	
	c01.setCellValue("Test1");
	c02.setCellValue("Test2");
	c03.setCellValue("Test3");
	
	wb.write(fileOut);
}
		
	}

}
