package xpathlocatorsexample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckBoxRadiobutton {

	@Test
	public void cap1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://applynow.capitalone.com/?productId=17801");
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//span[contains(text(),'Are you a U')]/following::input[1]")) );
		//driver.findElement(By.xpath("//span[contains(text(),'Are you a U')]/following::input[1]")).click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[contains(text(),'Are you a U')]/following::input[1]")));

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//span[text()='Additional Information']/following::input[1]")) );
		//driver.findElement(By.xpath("//span[text()='Additional Information']/following::input[1]")).click();
		
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span[text()='Additional Information']/following::input[1]")));
		//driver.quit();
		
		//Drop Down & Multiple Selects
		///WebTable Handling
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",driver.findElement(By.xpath("//span[text()='State']/following::Select[1]")) );
		Select zahid = new Select (driver.findElement(By.xpath("//span[text()='State']/following::Select[1]")));
		//zahid.selectByVisibleText("Michigan");
		zahid.selectByValue("VA");


	}

}
