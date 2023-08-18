package seleniumintermediate;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesDemoEx2 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		System.out.println("frame1--"+driver.findElement(By.id("sampleHeading")).getText());
		driver.switchTo().defaultContent();
	    WebElement frame2 = driver.findElement(By.id("frame2"));
	    driver.switchTo().frame(frame2);
	    System.out.println("frame2--"+driver.findElement(By.id("sampleHeading")).getText());
	    driver.quit();
	    

		

}
}
