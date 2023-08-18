package seleniumintermediate;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();

		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("confirmButton")).click();
		
		Alert confirmButton= driver.switchTo().alert();
		Thread.sleep(1000);
		confirmButton.accept();
		//confirmButton.dismiss();
		
		
	}

}
