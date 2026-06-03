package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	
	// Driver reference
	WebDriver driver;
	
	// Locator for product name displayed in cart
	By productName = By.className("inventory_item_name");
	
	// Constructor
	public CartPage(WebDriver driver) {
		
		// Assign driver
		this.driver = driver;
	}
	
	// get product name from Cart
	public String getProductName() {
		
		// Return product name text
		return driver.findElement(productName).getText();
	}

}
