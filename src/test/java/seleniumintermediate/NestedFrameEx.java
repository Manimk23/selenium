package seleniumintermediate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameEx {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement parentframe = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(parentframe);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		
		//child frame
		
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.tagName("body")).getText());
		driver.quit();
		
		
	}

}
