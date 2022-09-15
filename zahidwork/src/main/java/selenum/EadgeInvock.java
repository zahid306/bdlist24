package selenum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EadgeInvock {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.bdlist24.com/demo/");
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
