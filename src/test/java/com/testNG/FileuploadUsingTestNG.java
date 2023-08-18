package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileuploadUsingTestNG {
	static WebDriver driver;
	@Test
	public void Fileupload()
	{
		
	driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://the-internet.herokuapp.com/upload");
    driver.manage().window().maximize();
    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\manib\\Downloads\\HrZoK5eljrLcW6cu-Project_20Guidelines_SBS_FEB23.pdf");
    driver.findElement(By.id("file-submit")).click();
    if(driver.getPageSource().contains("File Uploaded!"))
    {
   	 System.out.println("uploaded Successfully...");
    }
    else
    {
   	 System.out.println("Not Succesfull....");
    }
    driver.quit();
}

}


