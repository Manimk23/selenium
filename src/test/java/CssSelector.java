

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		//username
		driver.findElement(By.cssSelector("input#userId")).sendKeys("maniblaze81@gmail.com");
		
		//password
		driver.findElement(By.cssSelector("input[title='Password']")).sendKeys("Mani2312@");
		
		//company name
		driver.findElement(By.cssSelector("input[placeholder='Enter your company']")).sendKeys("Amazon");
		
		//mobile no
		driver.findElement(By.cssSelector("input[name='mobile number']")).sendKeys("7708627600");
		
		//submit
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		
   
	}

}
