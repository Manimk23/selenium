package com.testNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadExcelUsingDataProvider {
	WebDriver driver = null;
	
	@DataProvider(name="fetchData")
	public Object[][] readExcel() throws IOException
	{
		Object[][] data = null;
		XSSFWorkbook workbook = null;
		try 
		{
		workbook = new XSSFWorkbook(System.getProperty("user.dir")+"/testData.xlsx");
		XSSFSheet sheet =workbook.getSheet("testData");
		XSSFRow row = sheet.getRow(0);
		
		int noOfrows = sheet.getPhysicalNumberOfRows();
		int noOfcells = row.getPhysicalNumberOfCells();
		
		data= new Object[noOfrows-1][noOfcells]; //data[5][2]
		for(int i=1;i<noOfrows;i++)
		{
			for(int j=0;j<noOfcells;j++)
			{
			String cellValaues = sheet.getRow(i).getCell(j).getStringCellValue();
			data[i-1][j]=cellValaues;
			//[0][0]->google.com
			//[0][1]->manual testing
			//[1][0]->google.com
			//[1][1]-> java basics
		}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			workbook.close();
		}
		return data;
		
	}
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	@Test(dataProvider="fetchData")
	public void fetchData(String url, String searchTerm) throws InterruptedException
	{
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(searchTerm);
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void closeBrowsers()
	{
		driver.quit();
	}

}


