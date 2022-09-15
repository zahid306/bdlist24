package actionclassexpale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionScroll {
	
	
	
	
	@Test
	public void cap() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		//driver.findElement(By.xpath("//a[text()='Position']"));
		WebElement sam = driver.findElement(By.xpath("//a[text()='Position']"));
		//store 
		Actions zahid1 = new Actions (driver);
		zahid1.moveToElement(sam);
	
		zahid1.build().perform();
		Thread.sleep(9000);
		driver.quit();
		
		
		
		
		
		

}
}