package seleniumintermediate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionEx {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();

		driver.navigate().to("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		//doubleclick
		WebElement dbclick= driver.findElement(By.id("doubleClickBtn"));
		ac.doubleClick(dbclick).build().perform();
		
		WebElement rtclick = driver.findElement(By.id("rightClickBtn"));
		ac.contextClick(rtclick).build().perform();
		
		WebElement cl = driver.findElement(By.xpath("//button[text()='Click Me']"));
		ac.click(cl).build().perform();
		driver.quit();
		
		
	}

}
