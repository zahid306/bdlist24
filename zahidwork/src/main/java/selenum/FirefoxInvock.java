package selenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxInvock {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\zahid\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.bdlist24.com/demo/");
		Thread.sleep(5000);
		driver.quit();
		
	}
	
	
	

}

//"C:\Users\zahid\Downloads\geckodriver-v0.31.0-win64\geckodriver.exe"