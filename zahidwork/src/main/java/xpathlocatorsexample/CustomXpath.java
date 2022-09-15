package xpathlocatorsexample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CustomXpath {

	
	@Test
	public void tom1 () {
	   
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		//driver.findElement(By.xpath("//button[text()='New Window']")).click();
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//span[text()='Frames']")) );
		// WebElement//
     // WebElement zahid=  driver.findElement(By.xpath("//div[text()='Forms']"));
     // zahid.clear();
	//Find Element and Elements
List<WebElement> li=	driver.findElements(By.xpath("//div[@class='header-text']"));
System.out.println(li.size());
		
		
		//driver.findElement(By.xpath("//span[text()='Frames']")).click();
		
		//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//span[text()='Frames']")) );

		//driver.findElement(By.xpath("(//li[@id='item-1'])[2]/span")).click();
	
	
	}
	
	

}
