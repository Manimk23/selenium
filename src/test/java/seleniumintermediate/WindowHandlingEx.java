package seleniumintermediate;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();

		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		
		//getting window handling
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("windowButton")).click();
		
		//ways
		//getWindowHandle
		//getWindowHnadles
		Set <String> allWindows= driver.getWindowHandles();
		for(String childwindow: allWindows)
		{
			if(!(parentWindow.equalsIgnoreCase(childwindow)))
			{
				driver.switchTo().window(childwindow);
				String childWin= driver.findElement(By.id("sampleHeading")).getText();
				System.out.println(childWin);
				driver.switchTo().window(parentWindow);
				String parentWindowText= driver.findElement(By.xpath("//div[@class='main-header']")).getText();
				System.out.println(parentWindowText);
			}
		}
		//driver.close();//to close the current window 
		driver.quit();//to close all the windows

	}

}
