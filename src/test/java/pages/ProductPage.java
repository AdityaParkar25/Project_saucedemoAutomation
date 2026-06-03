package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	// Driver object
	WebDriver driver;
	
	// Locator for backpack Add To Cart button
	By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
	
	// Locator for cart icon
	By cartIcon = By.className("shopping_cart_link");
	
	//Constructor
	public ProductPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	// Add product to cart
	public void addProductToCart() {
		
		// click add to cart button
		driver.findElement(addToCartBtn).click();
	}
	
	// Open shopping cart
	public void openCart() {
		
		//click cart icon
		driver.findElement(cartIcon).click();
	}

}
