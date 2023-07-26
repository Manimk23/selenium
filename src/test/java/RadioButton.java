import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
    driver = new ChromeDriver();
    driver.manage().window();
    driver.get("https://demo.guru99.com/test/radio.html");
    driver.findElement(By.xpath("//input[@value='Option 1']")).click();
    Thread.sleep(1000);
    System.out.println("select the first button:");
    
    driver.findElement(By.xpath("//input[@value='Option 3']")).click();
    Thread.sleep(1000);
    System.out.println("Select the third option:");
    
    driver.findElement(By.xpath("//input[@value='checkbox1']")).click();
    Thread.sleep(1000);
    System.out.println("Select the first checkbox option:");
    
    WebElement thirdCheckbox=driver.findElement(By.xpath("//input[@value='checkbox3']"));
    thirdCheckbox.click();
    Thread.sleep(1000);
	System.out.println("Selected the third checkbox option");
	if(thirdCheckbox.isSelected())
	{
		System.out.println("Third check box selection validated");
	}
	else
	{
		System.out.println("Validation failure for third checkbox selection");
	}
    
    
	}

}
