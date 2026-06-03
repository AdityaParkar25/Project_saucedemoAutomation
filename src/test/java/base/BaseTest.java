package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.DriverFactory;

public class BaseTest {
	
	// Protected driver accessible to child classes
	protected WebDriver driver;
	
	// runs before every test method
	@BeforeMethod
	public void setup() {
		
		// initialize browser
		driver = DriverFactory.getDriver();
		
		// open website URL
		driver.get("https://www.saucedemo.com/");
	}
	
	// runs after every test method
	@AfterMethod
	public void tearDown() {
		
		// close browser completely
		driver.quit();
	}

}
