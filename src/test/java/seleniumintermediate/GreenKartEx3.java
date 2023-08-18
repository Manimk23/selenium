package seleniumintermediate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKartEx3 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.findElement(By.className("search-keyword")).sendKeys("ber");
	     Thread.sleep(1000);
	     List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
	     
	     for(WebElement addToCartButton: addToCartButtons )
	     {
	    	 addToCartButton.click();
	     }
	     driver.findElement(By.cssSelector("a.cart-icon")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.cssSelector("div.action-block")).click();
	     driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	     WebElement positive = driver.findElement(By.cssSelector("button.promoBtn"));
	     positive.click();
	     
	     //explicit wait to read the discount value
	     
	     //getting TotalAmount
	     String totalAmounttext =driver.findElement(By.cssSelector("span.totAmt")).getText();
	       int totalAmount = Integer.parseInt(totalAmounttext);
	       System.out.println("Total Amount---"+totalAmount);
	       
	       //getting Discount
	       String DiscountText= driver.findElement(By.xpath("//span[text()='10%']")).getText();
	       System.out.println(DiscountText);
	       double discountPercentage = Double.parseDouble(DiscountText.replaceAll("%", ""));
	       System.out.println("Discount--" + discountPercentage + "%");
	       
	     //Getting TotalDiscounted
	       double discount = discountPercentage/100.0;
	       double discountedAmount = totalAmount - (totalAmount * discount);
	       System.out.println("TotalDiscountedAmount---"+discountedAmount);
	       

	}

}
