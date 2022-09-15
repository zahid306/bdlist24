package testngExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupExample {
	
	@BeforeSuite
	
	@Test(groups = {"Regression"})
	public void verifylogin1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
				driver.get("https://www.google.com");
				Thread.sleep(5000);
				driver.quit();
		
	}
	
	@Test(groups = {"sanity","Regression"})
	public void verifysigin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
				driver.get("https://www.yahoo.com");
				Thread.sleep(5000);
				driver.quit();
	
								
	}
	
	@Test(groups = {"Regression"})
	public void verifysignout() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
				driver.get("https://www.bdlist24.com/demo");
				Thread.sleep(5000);
				driver.quit();
	
									

		
	}
	
	

}
