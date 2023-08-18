package seleniumintermediate;

import java.time.Duration;
import java.util.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

public class GreenKart {
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
     //Entering the coupon code
     driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
     //driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahul");
     
     WebElement positive = driver.findElement(By.cssSelector("button.promoBtn"));
     positive.click();
     WebElement promoInfoElement = driver.findElement(By.cssSelector("span.promoInfo"));
     String promoInfoText = promoInfoElement.getText();
     if(promoInfoText.equals("Code applied ..!"))
     {
    	 System.out.println("valid coupon code!!!");
     }
     else
     {
    	 System.out.println("invalid code!!!");
     }
     
     //place oder button
     driver.findElement(By.xpath("//button[contains(text(), 'Place Order')]")).click();
     Thread.sleep(1000);
     
     //selecting region
     driver.findElement(By.xpath("//option[contains(text(), 'India')]")).click();
     Thread.sleep(1000);
     
     //clicking checkbox
     driver.findElement(By.cssSelector("input.chkAgree")).click();
     Thread.sleep(1000);
     
     //final submit
     driver.findElement(By.xpath("//button[contains(text(), 'Proceed')]")).click();
     Thread.sleep(1000);
     
     driver.quit();
     
     
}
}