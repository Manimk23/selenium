package seleniumintermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorEx2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
Thread.sleep(4000);
		
		//JavascriptExecutor is used to execute javascript commands in Selenium
JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
		//Pass value to a text box without using sendkeys()
		WebElement searchText=driver.findElement(By.name("q"));
		js1.executeScript("arguments[0].value='Javascriptexecutor';", searchText);
		
		//click on a webelement
		WebElement imageClick=driver.findElement(By.linkText("Images"));
		js1.executeScript("arguments[0].click();", imageClick);
		
		
	}

}
