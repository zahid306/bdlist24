package extandreportexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extreportex {
	
	
	static ExtentReports report;
	
	static ExtentTest test;
	
	@BeforeClass
	public void m() {
		
		report =new ExtentReports(System.getProperty("user.dir")+"\\zahidreport.html");
          test=report.startTest("smoketest");

	}
	
	@Test
	public void hh() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.bdlist24.com/demo/");
		test.log(LogStatus.INFO, "we have landed on demo site.");
		test.log(LogStatus.FAIL,"we DID NOT seen the home page.");
		
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	@AfterClass
	public void uu(){
		report.endTest(test);
		report.flush();
	}

}
