package seleniumintermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;

public class KeyboardActionsEx {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();

		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		
		Actions ac =new Actions(driver);
		WebElement searchText = driver.findElement(By.name("q"));
		ac.keyDown(searchText,Keys.SHIFT).sendKeys("keyboard action class").build().perform();
		driver.quit();
	}
	

}
