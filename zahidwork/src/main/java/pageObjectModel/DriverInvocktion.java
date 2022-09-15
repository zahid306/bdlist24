package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DriverInvocktion {
	
	public static WebDriver driver;
	
@BeforeTest
public void cap() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		 driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	
	
	}


@Test
public void tr() {
	LoginPage op= new LoginPage(driver);
	op.login();
	HomePage hm= new HomePage(driver);
    hm.clivkonwCustomer();
	
}

}
