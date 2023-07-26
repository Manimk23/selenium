

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathEx {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Automation Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Images']")).click();
   
	}

}
