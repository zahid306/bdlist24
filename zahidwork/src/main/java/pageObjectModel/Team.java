package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Team {

	
	
	
	@Test
	public void cap() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	
	    driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr434897");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AjasuqE");
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	    driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	    
	    
	
	
	
	
	
	//https://demo.guru99.com/V4/

	
	
	
	
	
	
}	
	
}
