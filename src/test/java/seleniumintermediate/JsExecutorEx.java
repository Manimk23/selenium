package seleniumintermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorEx {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
	     Thread.sleep(2000);
	     
	     JavascriptExecutor js = (JavascriptExecutor)driver;
	     //vertical scroll dowm
	     
	     js.executeScript("window.scrollTo(0,500);");
	     Thread.sleep(1000);
	     
	     //scrollup
	     js.executeScript("window.scrollTo(0,-500);");
	     Thread.sleep(1000);
	     
	     //titlepage
	     System.out.println(js.executeScript("return document.title;"));
	     
	     //bottomOfPage
	     
	     js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	     
	     //ToTop
	     js.executeScript("window.scrollTo(0,0);");
	     
	     //scrollintoView
	     
	     WebElement footText = driver.findElement(By.xpath("//strong[text()='GreenKart']"));
	     js.executeScript("arguments[0].scrollIntoView(true);", footText);
	}

}
