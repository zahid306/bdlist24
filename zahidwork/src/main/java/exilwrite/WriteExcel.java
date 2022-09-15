package exilwrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class WriteExcel {

	
public static void main(String[] args) {
	try {
		FileInputStream excel = new FileInputStream("C:\\Users\\zahid\\Documents\\SeleniumTraining\\testdata.xlsx");
		XSSFWorkbook excelt = new XSSFWorkbook(excel);
		XSSFSheet mysheet = excelt.getSheet("zh");
	   XSSFCell zahid=	mysheet.getRow(1).createCell(3);
	   zahid.setCellValue("MDFN VDJFG");
	   
	   
	   XSSFCell ali = mysheet.getRow(2).createCell(4);
	   ali.setCellValue("I need mobile");
	   
	   
	   FileOutputStream fr= new FileOutputStream("C:\\Users\\zahid\\Documents\\SeleniumTraining\\testdata.xlsx");
	   excelt.write(fr);
		
		
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
	
	
	
	
}
