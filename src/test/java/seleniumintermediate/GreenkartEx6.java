package seleniumintermediate;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenkartEx6 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     //using WindowHandling
	     String parentWindow = driver.getWindowHandle();
	     driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();
	     
	    Set<String> childHandles = driver.getWindowHandles();
	    for(String Handles :childHandles )
	    {
	    	if(!Handles.equals(parentWindow))
	    	{
	    		driver.switchTo().window(Handles);
	    		
	    	}
	    }
	    
	    
	     // country selecting
	     driver.findElement(By.xpath("//input[@placeholder='Type to Select']")).sendKeys("india");
	     
	     //way of trip
	     driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
	     
	     //from
	     driver.findElement(By.xpath("//input[@value='Departure City']")).sendKeys("Coimbatore");
	     
	     //To
	     driver.findElement(By.xpath("//input[@value='Arrival City']")).sendKeys("Chennai");
	     
	     driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();
	     
	     // shifting window access to calender
	     
	     
	     
	     
	     
	     
	     
	     
	     
	}

}
