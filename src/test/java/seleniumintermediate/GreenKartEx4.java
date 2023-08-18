package seleniumintermediate;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GreenKartEx4 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     //top deals
	     String parentWindow = driver.getWindowHandle();
	     driver.findElement(By.xpath("//a[text()= 'Top Deals']")).click();
	     
	     
	     //getting fruit/veg name
	     Set <String> allWindows= driver.getWindowHandles();
			for(String childwindow: allWindows)
			{
				if(!(parentWindow.equalsIgnoreCase(childwindow)))
				{
					driver.switchTo().window(childwindow);
					break;
					
				}
			}
			//table elements located
			 WebElement table = driver.findElement(By.cssSelector(".table.table-bordered"));
			
			//getting all rows
			List<WebElement> rows = driver.findElements(By.tagName("tr"));
			
			//getting cells inside rows
			
			for(int i =1; i<rows.size();i++)
				
			{
				List<WebElement> cells  =rows.get(i).findElements(By.tagName("td"));
				for(WebElement cell:cells)
				{
					System.out.println(cell.getText()+"\t");
				}
				System.out.println();
			}
			
            driver.quit();
	  
	      
	   
	}

}
	
