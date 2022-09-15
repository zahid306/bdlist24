package propertyfilereading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pfr {
@Test

 public void sam () throws IOException, InterruptedException {
	InputStream rt = new FileInputStream ("C:\\Users\\zahid\\Desktop\\zahid.properties");
	Properties pt=new Properties();
	pt.load(rt);
	//We use to call ENV 
	//String ee=pt.getProperty("name");
	String ee=pt.getProperty("UAT");
	System.out.println(ee);

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.manage().window().maximize();
	driver.get(ee);
	
	Thread.sleep(5000);
	
}


	
}
