package xpathlocatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

	
	
	
	
	@Test
	
	public void a () throws InterruptedException {
		
	
		//invock
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/forms");
		driver.findElement(By.xpath("//span[text()='Practice Form']")).click();
		//driver.findElement(By.id("firstName")).sendKeys("zahid");
		//driver.findElement(By.className(" mr-sm-2 form-control")).sendKeys("Zahid");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("abcd@abcd.com");
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
	
	
	
	}
	
	
	
	}
	
	
	
			
			



