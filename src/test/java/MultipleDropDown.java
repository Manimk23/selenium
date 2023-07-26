import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropDown {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demoqa.com/select-menu");
	    Select sel = new Select(driver.findElement(By.id("cars")));
	    sel.selectByVisibleText("Volvo");
	    sel.selectByVisibleText("Opel");
	    sel.selectByVisibleText("Audi");
	    List<WebElement> alloption =sel.getOptions();
	    System.out.println("Theoptions are:");
	    for(WebElement option:alloption)
	    {
	    	System.out.println(option.getText());
	    }
	    
	    System.out.println("-----------");
	    
	    List<WebElement> seloption = sel.getAllSelectedOptions();
	    System.out.println("The selected options are:");
	    for(WebElement soption: seloption)
	    {
	    	System.out.println(soption.getText());
	    }
	    
	    driver.quit();
	    

	}

}
