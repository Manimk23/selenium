package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropUsingTestNG {
	static WebDriver driver;
	@Test
	public void DragandDrop()
	{
		
		driver=new ChromeDriver();

		driver.navigate().to("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		WebElement dg= driver.findElement(By.id("draggable"));
		WebElement dp = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(dg, dp).build().perform();
	    String validation = dp.getText();
	    if(validation.equals("Dropped!"))
	    {
	    	System.out.println("Succesful validation....");
	    }
	    else
	    {
	    	System.out.println("Invalid Validation...");
	    }
		driver.quit();
		
	}




	}


