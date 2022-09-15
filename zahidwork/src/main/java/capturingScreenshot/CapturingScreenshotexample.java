package capturingScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class CapturingScreenshotexample {
	
	
	@Test
	public void cap() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://yahoo.com");
		
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		
		
		Date zd= new Date();
		SimpleDateFormat df= new SimpleDateFormat("dd-mm-yyyy-hhmmss");
	String RealName=	df.format(zd);
		
File rr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File des= new File("C:\\Users\\zahid\\Documents\\AutomationSCreenshots\\"+RealName+".png");

	FileHandler.copy(rr, des);

}
}