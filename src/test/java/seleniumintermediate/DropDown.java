package seleniumintermediate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/select-menu");
    
    
    Select sel = new Select(driver.findElement(By.id("oldSelectMenu")));
    sel.selectByIndex(0);
    Thread.sleep(1000);
    
    sel.selectByValue("4");
    Thread.sleep(1000);
    
    sel.selectByVisibleText("Indigo");
    Thread.sleep(1000);
    
    List<WebElement> alloption =sel.getOptions();
    for(WebElement option:alloption)
    {
    	System.out.println(option.getText());
    }
    driver.quit();
    
	}

}
