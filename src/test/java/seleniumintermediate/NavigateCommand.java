package seleniumintermediate;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
     driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demoqa.com");
     driver.findElement(By.xpath("//div[@class='category-cards']/div[1]/div")).click();
     Thread.sleep(2000);
     driver.navigate().back();
     Thread.sleep(2000);
     driver.navigate().forward();
     Thread.sleep(2000);
     driver.navigate().refresh();
     Thread.sleep(2000);
     driver.navigate().to("https:///www.google.com");
     driver.quit();
     
     
	}

}
