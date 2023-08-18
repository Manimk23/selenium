package seleniumintermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitEx {
	static WebDriver driver;
	public static void main(String[] args) {
		try
		{
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
		//FluentWait --> We can apply Fluent wait only to a specific webelement but we can mention the polling time frame(interval at which webelement is checked) 
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20)) //maximum timeout
				.pollingEvery(Duration.ofSeconds(1)); //interval timeout
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q123")));
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
