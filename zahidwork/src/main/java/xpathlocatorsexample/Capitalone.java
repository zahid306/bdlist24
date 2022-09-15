package xpathlocatorsexample;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;

public class Capitalone {
	
	@Test
	public void cap() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\zahid\\Documents\\SeleniumTraining\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://applynow.capitalone.com/?productId=17199");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		
		
		
		driver.findElement(By.id("firstName")).sendKeys("Zahid");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
		driver.findElement(By.id("middleName")).sendKeys("H");
		
		
		driver.findElement(By.id("lastName")).sendKeys("hussin");
		driver.findElement(By.id("dateOfBirth")).sendKeys("05/29/1981");
		driver.findElement(By.id("socialSecurity")).sendKeys("009-34-4534");
		
		driver.findElement(By.xpath("//span[text()='Are you a U.S. citizen?']/following::input[1]")).click();
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Are you a U.S. citizen?']/following::input[3]")).click();
		driver.findElement(By.id("address.residential.addressLine1")).sendKeys("8701 libeau dr");
		driver.findElement(By.id("address.residential.addressLine2")).sendKeys("201");
		driver.findElement(By.id("address.residential.zipcode")).sendKeys("22012");
		driver.findElement(By.id("address.residential.city")).sendKeys("manssas");
		driver.findElement(By.id("address.residential.state")).sendKeys("Alabama");
		driver.findElement(By.id("email")).sendKeys("sam@yahoo.com");
		driver.findElement(By.id("phone")).sendKeys("703-988-0945");
		driver.findElement(By.id("employmentStatus")).sendKeys("Employed");
		driver.findElement(By.id("totalAnnualIncome")).sendKeys("4500");
		driver.findElement(By.id("monthlyRentMortgage")).sendKeys("459");
		driver.findElement(By.id("bankAccounts")).sendKeys("Checking And Savings");
		driver.findElement(By.id("revolvingBalance")).sendKeys("Never");
		driver.findElement(By.id("cashadvances-radio-0")).click();
		driver.findElement(By.id("balancetransfers-radio-0")).click();
		driver.findElement(By.id("paperlessConsent")).click();
		driver.findElement(By.name("grv-button grv-button--progressive grv-button--padding-large StyledButton-sc-1sluptn-2 esoqbe")).click();
		
		
		
		
		
		
		
	}

}
