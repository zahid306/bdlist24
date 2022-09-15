package actionclassexpale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
///ActionClass-- 
//dragAndDrop
//
public class ActionClass {
	
	@Test
	public void cap() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		
		driver.switchTo().frame(0);
		
		WebElement sourse = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable")); 
		
		//Action class 
		
		Actions zahid = new Actions (driver);
		
		zahid.dragAndDrop(sourse, destination);
		Thread.sleep(1000);
		zahid.build().perform();
		Thread.sleep(6000);
		driver.quit();
		
		
	
	

}
}