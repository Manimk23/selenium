

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEdge {
	
	static WebDriver driver;

	public static void main(String[] args) {
    driver = new EdgeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    driver.quit();
	}

}
