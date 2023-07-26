
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getlinks {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("selenium ide");
		driver.findElement(By.cssSelector("textarea#APjFqb")).submit();
		Thread.sleep(1000);
		 List<WebElement> links=driver.findElements(By.tagName("a"));
	     System.out.println("The urls are :");
	     for(WebElement link:links)
	     {
	    	 System.out.println(link.getAttribute("href"));
	     }
        driver.quit();
	}
      
}
