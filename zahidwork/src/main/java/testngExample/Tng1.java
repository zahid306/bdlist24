package testngExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tng1 {

	
	public WebDriver driver;
	
	
	@BeforeSuite
	public void ft() {
		System.out.println("Me beofre Suite");
	}
	
	@AfterSuite
	public void th() {
		System.out.println("Me After Suite");
	}
	
	@BeforeClass
	public void n1() {
		System.out.println("Me before class");
	}
	
	@AfterClass
	public void n2() {
		System.out.println("Me After class");
	}
	
	@BeforeMethod
	public void bfm() {
		
	}
	
	@AfterMethod
	public void n() {
		
	}
	
	
	//method 
	@Test(priority = 1)
	public void VerifyTheTile() throws InterruptedException {
		
		//invock
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
				 
				driver.get("https://www.bdlist24.com/demo/");
				Thread.sleep(5000);
				driver.quit();
		
	}
	
	
	@Test (priority = 3)
	public void VerifyLogin() throws InterruptedException {
		
		//invock
				
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
				driver.get("https://www.bdlist24.com/demo/");
				Thread.sleep(5000);
				driver.quit();
				
		
	}
	
	
	@Test (priority = 2)
	public void VerifyLogour() throws InterruptedException {
		
		//invock
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
				driver.get("https://www.bdlist24.com/demo/");
				Thread.sleep(5000);
				
				driver.quit();
	}
	
	
	
}
