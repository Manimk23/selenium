package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	WebDriver driver = null;
	
	@BeforeMethod
	public void launchbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	//@Test(dataProvider ="testdata")
	
	@Test(dataProvider="dataset")
	public void fetchdata(String url, String searchterm) throws InterruptedException
	{
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(searchterm);
		Thread.sleep(2000);
	}
	//@DataProvider(name ="testdata")
	@DataProvider 
	public Object[][] dataset()
	{
		/*1st way of declaring
		
		Object[][] data = new Object[3][2];
		return data;
		*/
		
		/*2nd way
		Object[][] data = new Object[][] {
			{"https://www.google.com", "Guvi"},
			{"https://www.google.com", "Parameter Annotation"},
			{"https://www.google.com", "Data Provider"}
			
		};
		return data;*/
		
		//3rd way
		
		return new Object[][] {
			{"https://www.google.com", "Guvi"},
			{"https://www.google.com", "Parameter Annotation"},
			{"https://www.google.com", "Data Provider"}
		};
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}

}
