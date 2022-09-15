package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	

		WebDriver driver;

		public LoginPage(WebDriver driver) {

			this.driver = driver;

		}
	
	
	
public void login() {
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr434897");
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("AjasuqE");
	    driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
}

}
