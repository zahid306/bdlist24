/**
 * 
 */
package ExcelFileReaderW;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * @author zahid
 *
 */
public class SampleEr {

	public static void main(String[] args) {
		// SampleEr excel = new SampleEr ();
		try {
			FileInputStream excel = new FileInputStream("C:\\Users\\zahid\\Documents\\SeleniumTraining\\testdata.xlsx");
			XSSFWorkbook excelt = new XSSFWorkbook(excel);
			XSSFSheet mysheet = excelt.getSheet("zh");
			
			
			for (int i = 0; i < mysheet.getLastRowNum(); i++) {
				System.out.println(mysheet.getRow(i).getCell(1).getStringCellValue());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
