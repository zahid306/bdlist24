package actionclassexpale;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RobotClass {
	
	
	@Test
	public void cap() throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://spreadsheetpage.com/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		
		WebElement sam =driver.findElement(By.xpath("//input[@name='email']"));
		
		Actions zahid2 = new Actions (driver);
		zahid2.moveToElement(sam);
	 
		zahid2.build().perform();
		sam.sendKeys("ACBS");
		Robot zahid = new Robot();
		zahid.keyPress(KeyEvent.VK_ENTER);
		zahid.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		
	
	

}
}

