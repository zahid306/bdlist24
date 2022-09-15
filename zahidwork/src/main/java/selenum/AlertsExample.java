package selenum;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	
public static void main(String[] args) throws InterruptedException {
		
		//invock
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");     
        driver.findElement(By.name("submit")).submit(); 
         
        
        // Capturing alert message. 
        //except and dismiss 
        //String zahid= driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        //driver.switchTo().alert().dismiss();
        
        //System.out.println(zahid);
		
		Thread.sleep(5000);
		driver.quit();
	
	
	
	
	
	
	
	
	
}
}