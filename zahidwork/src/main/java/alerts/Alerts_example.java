package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;



public class Alerts_example {
	
	@Test()
	public void urllanc() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/alerts");
	driver.findElement(By.id("alertButton")).click();
	Thread.sleep(1000);
	Alert zahid=driver.switchTo().alert();
	String hr=zahid.getText();
System.out.println(hr);
	
	
	driver.quit();
	}
}
