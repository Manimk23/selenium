

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorEx {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("APjFqb")).sendKeys("guvi");
		Thread.sleep(1000);
		driver.findElement(By.className("gLFyf")).clear();
		Thread.sleep(1000);
		driver.findElement(By.tagName("textarea")).sendKeys("guvi software testing");
		Thread.sleep(1000);
		
		//driver.findElement(By.linkText("Images")).click();
		driver.findElement(By.partialLinkText("Imag")).click();
		
		
    
	}

}
