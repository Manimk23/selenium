

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("selenium webdriver");
		driver.findElement(By.cssSelector("textarea#APjFqb")).submit();
		driver.findElement(By.cssSelector("a[href='https://www.selenium.dev/documentation/webdriver/']")).click();
		System.out.println("Title of this page is: "+driver.getTitle());
		driver.quit();
		

	}

}
