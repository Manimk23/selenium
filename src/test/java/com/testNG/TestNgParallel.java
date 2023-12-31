package com.testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgParallel {
	WebDriver driver = null;
	@BeforeMethod
	public void launchbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		@Test (invocationCount=3, threadPoolSize=3)
		public void launchGoogle()
		{
			driver.get("https://www.google.com");
			String expectedTitle="Google";
			Assert.assertTrue(driver.getTitle().equals(expectedTitle));

			
		}
		public void launchYahoo()
		{
			driver.get("https://in.search.yahoo.com/");
			String expectedTitle="Yahoo Search - Web Search";
			Assert.assertTrue(driver.getTitle().equals(expectedTitle));

			
		}
		public void launchBrowserStack()
		{
			driver.get("https://www.browserstack.com/");
			String expectedTitle="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
			Assert.assertTrue(driver.getTitle().equals(expectedTitle));
		}
		@AfterMethod
		public void closebrowser()
		{
			driver.quit();
		}
		
	}


