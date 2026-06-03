package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	// Driver reference
	WebDriver driver;
	
	// get the assigned locators
	By username = By.id("user-name");     // Locator for username textbox
	By password = By.id("password");      // Locator for password textbox
	By loginBtn = By.id("login-button");  // Locator for login button
	
	// Constructor receives driver from test class
	public LoginPage(WebDriver driver) {
		
		// assign local driver
		this.driver = driver;
	}
	
	// Login functionality
	public void login(String user, String pass) {
		
		// enter username
		driver.findElement(username).sendKeys(user);
		
		// enter password
		driver.findElement(password).sendKeys(pass);
		
		// click login button
		driver.findElement(loginBtn).click();
		
	}

}
