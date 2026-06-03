package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	// Static WebDriver instance shared across framework
	private static WebDriver driver;
	
	// Method to initialize and return driver
	public static WebDriver getDriver() {
		
		// check whether driver is already created
		if(driver == null) {
			
			// Download and configure Chromer driver automatically
			WebDriverManager.chromedriver().setup();
			
			// Launch Chrome browser
			driver = new ChromeDriver();
			
			// Maximize browser window
			driver.manage().window().maximize();
			
		}
		
		// return driver instance
		return driver;
		
	}
	
}
