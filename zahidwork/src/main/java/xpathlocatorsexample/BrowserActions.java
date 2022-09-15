package xpathlocatorsexample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserActions {
	
	
	
	
	@Test
	
 public void ayaaz1() throws InterruptedException {
	 
	 
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
	 //main 
	  WebDriver driver = new ChromeDriver ();
	 //maximize 
	  driver.manage().window().maximize();
	  
	  driver.get("https://yahoo.com/");
	  
	  driver.get("https://google.com/");
	  
      driver.navigate().back();
      driver.navigate().refresh();
      driver.quit();
      
      
}
}