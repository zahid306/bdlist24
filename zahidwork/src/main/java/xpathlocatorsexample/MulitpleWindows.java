package xpathlocatorsexample;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MulitpleWindows {
	
	
	@Test
	
 public void ayaaz() throws InterruptedException {
	 
	 
	
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
	 //main 
	  WebDriver driver = new ChromeDriver ();
	 //maximize 
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/forms");
	  //implicitlyWait
	  //driver.manage().timeouts().implicitlyWait(600,TimeUnit.SECONDS);
	 // driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
	  
	  //waite t
	  
	  
	  
	  
	  
	  
	// Open new child window within the main window
			driver.findElement(By.id("windowButton")).click();


			String mainWindowHandle = driver.getWindowHandle();
			Set<String> allWindowHandles = driver.getWindowHandles();
			Iterator<String> iterator = allWindowHandles.iterator();
			while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
			driver.switchTo().window(ChildWindow);

			}
			}
			String y = driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(y);

			Thread.sleep(5000);
			driver.quit();
	  
	  
	  
	  
}	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
