package seleniumintermediate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenkartEx5 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     List<WebElement>  prod = driver.findElements(By.className("product-name"));
	     System.out.println("Veggies---->");
	     for(WebElement product:prod )
	     {
	    	 String productname = product.getText().trim();//used to remove empty white spaces
	    	 if(!productname.isEmpty()) {
	    		 System.out.println(product.getText()); 
	    	 }
	    	
	     }
	     driver.quit();
	}

}
