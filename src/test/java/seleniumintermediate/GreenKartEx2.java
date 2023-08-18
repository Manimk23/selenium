package seleniumintermediate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartEx2 {
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
	     
	     // Find all elements with the locator "p.amount" (which represent the prices).
	        List<WebElement> priceElements = driver.findElements(By.cssSelector("p.amount"));
	        //locator = //tbody/tr/td[5]
	        int count =0;
	        int totalprice=0;
	        for (WebElement priceElement : priceElements) {
	            String priceText = priceElement.getText();
	            if (count < 3) {
	                System.out.println("Price: " + priceText);
	                int price = Integer.parseInt(priceText);
		            totalprice+=price; 
	                
	            }
	            count++;
	            
	}
	       System.out.println("Total price--"+totalprice); 
	       String totalAmounttext =driver.findElement(By.cssSelector("span.totAmt")).getText();
	       int totalAmount = Integer.parseInt(totalAmounttext);
	       System.out.println("Total Amount---"+totalAmount);
	       //comparing
	       
	       if(totalprice == totalAmount)
	       {
	    	   System.out.println("Values are equal....");
	       }
	       else
	       {
	    	   System.out.println("Not Equal...");
	       }
	      
}
}
