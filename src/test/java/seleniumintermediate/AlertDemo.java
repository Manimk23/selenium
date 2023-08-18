package seleniumintermediate;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class AlertDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();

		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("promtButton")).click();
		
		
		/*
		 * switchto.alert()
		 * getText()
		 * sendkeys()
		 * accept()
		 * dismiss()
		 */
		//switching the control from the browser to the alert
		Alert promptAlert= driver.switchTo().alert();
		
		System.out.println(promptAlert.getText());
		
		promptAlert.sendKeys("Guvi Selenium");
		Thread.sleep(2000);
		
		promptAlert.accept();
		
		//promptAlert.dismiss();

}
}
