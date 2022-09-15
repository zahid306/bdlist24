package actionclassexpale;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoveraction {
	
	
	@Test
	public void cap() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		
		WebElement sam =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		
		Actions zahid2 = new Actions (driver);
		zahid2.moveToElement(sam);
	 
		zahid2.build().perform();
		Thread.sleep(9000);
		driver.quit();
	
	
	}

}
