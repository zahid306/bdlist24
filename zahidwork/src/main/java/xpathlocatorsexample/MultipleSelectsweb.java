package xpathlocatorsexample;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.ThreeDEval;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleSelectsweb {
	
	@Test
	public void cap() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
        
	WebElement zahid=	driver.findElement(By.xpath("//select[@name='selenium_commands']"));
	
	Select iddiqui= new Select(zahid);
	Thread.sleep(2000);
	iddiqui.selectByIndex(1);
	Thread.sleep(2000);
	iddiqui.selectByIndex(2);
	Thread.sleep(2000);
	iddiqui.selectByIndex(3);
		
	

}
}