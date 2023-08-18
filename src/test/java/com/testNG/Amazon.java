package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {

	WebDriver driver = null;
	@BeforeMethod
	public void launchbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	
	public void amazon() throws InterruptedException
	{
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Printers");
		Thread.sleep(2000);
		
		
		
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}
