import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class NavigateUrl {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("selenium ide");
	driver.findElement(By.cssSelector("textarea#APjFqb")).submit();
	Thread.sleep(1000);
	List<WebElement> links=driver.findElements(By.tagName("a"));
    System.out.println("The urls are :");
    for(WebElement link:links)
    {
    	String href =link.getAttribute("href");
   	 System.out.println(href);
   	 //driver.navigate().to(href);
    }
    for(WebElement link:links)
    {
        String href =link.getAttribute("href");
        driver.navigate().to(href);
    }

    driver.quit();
}
}
