package extandreportexample;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

 class Extandrep2 {
	
		static ExtentReports report;
		
		 ExtentTest test;
		 
		 public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
			  // below line is just to append the date format with the screenshot name to
			  // avoid duplicate names
			  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			  TakesScreenshot ts = (TakesScreenshot) driver;
			  File source = ts.getScreenshotAs(OutputType.FILE);
			  // after execution, you could see a folder "FailedTestsScreenshots" under src
			  // folder
			  String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
			    + ".png";
			  File finalDestination = new File(destination);
			  FileHandler.copy(source, finalDestination);
			  // Returns the captured file path
			  return destination;
			 }

		 

		 
		@BeforeClass
		public void m() {
			
			report =new ExtentReports(System.getProperty("user.dir")+"\\zahidreport.html");
	        
		}
		public WebDriver driver;
		
		@BeforeMethod
		public void ll() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
		}
		@Test
		public void hh() throws Exception {
			test=report.startTest("smoketest");
			driver.get("https://www.google.com/");
			test.log(LogStatus.INFO, "we have landed on demo site.");
			String screenshotPath = getScreenshot(driver, "sample");
			test.log(LogStatus.INFO,test.addScreenCapture(screenshotPath) );
			test.log(LogStatus.PASS,"we DID NOT seen the home page.");
				
		}
		
		@Test
		public void hh1() throws Exception {
			test=report.startTest("UATTest");
			driver.get("https://www.bdlist24.com/demo/");
			String screenshotPath = getScreenshot(driver, "sample");
			test.log(LogStatus.INFO,test.addScreenCapture(screenshotPath) );
			test.log(LogStatus.INFO, "we have landed on demo site.");
			test.log(LogStatus.FAIL,"we DID NOT seen the home page.");
				
		}
		
		@AfterMethod
		public void hh2() throws InterruptedException {
			Thread.sleep(5000);
			driver.quit();
		}
		
		@AfterClass
		public void uu(){
			report.endTest(test);
			report.flush();
		}

	}

	
	
	
	


