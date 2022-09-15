package selenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.reporters.jq.Main;

public class ChromeInvock {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//invock
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		Thread.sleep(5000);
		driver.quit();
	}

}
