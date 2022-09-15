package pageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;

	}
	
	public void clivkonwCustomer() {
		 driver.findElement(By.xpath("//a[text()='New Customer']")).click();
	}

	
	
}


