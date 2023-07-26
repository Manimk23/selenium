

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumide {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("selenium ide");
		driver.findElement(By.cssSelector("textarea#APjFqb")).submit();
		Thread.sleep(2000);
		
		//1st link
		//driver.findElement(By.cssSelector("a[href='https://www.selenium.dev/selenium-ide/']")).click();
		
		//5th link
		driver.findElement(By.cssSelector("a[href='https://www.simplilearn.com/tutorials/selenium-tutorial/selenium-ide']")).click();
		
  
	}

}
