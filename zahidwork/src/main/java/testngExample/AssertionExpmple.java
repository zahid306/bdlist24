package testngExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExpmple {
	@Test
	public void verifylogin1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bdlist24.com/demo");
		Thread.sleep(5000);
		SoftAssert zahid= new SoftAssert();
		if (driver.findElement(By.xpath("(//input[@value='Update location1'])[1]")).isDisplayed()) {
			System.out.println("BUton has displyed..");
		} else {
			//Assert.fail("BUtton has not found");// HARD ASSERT
			
			zahid.assertTrue(false);
			zahid.assertAll();
			
		}
		driver.quit();
		

		

	}
////
	@Test(dependsOnMethods = "verifylogin1")
	public void verifylogout() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(5000);
		driver.quit();

	}
}
