

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathforpracticepage {
static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
		//username box
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("maniblaze81@gmail.com");
		//driver.findElement(By.xpath("//input[@title='Email']"));
		
		//password box
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("mani@123");
		
		//driver.findElement(By.xpath("//input[@type='password']"));
		//company box
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Amazon");
		
		//mobile no
		driver.findElement(By.xpath("//input[@name='mobile number'and @type='number']")).sendKeys("7708627600");
		
		//submit
		driver.findElement(By.xpath("//input[@value='Submit'or @type='submit']")).click();
		
   
	}

}
