package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

public class PurchaseTest extends BaseTest {
	
	// TestNg Test method
	@Test
	public void verifyAddToCart() {
		
		// create login page object
		LoginPage loginPage = new LoginPage(driver);
		
		// login using valid credentials
		loginPage.login("standard_user", "secret_sauce");
		
		// create product page object
		ProductPage productPage = new ProductPage(driver);
		
		// add backpack to cart
		productPage.addProductToCart();
		
		// navigate to cart page
		productPage.openCart();
		
		// create cart page object
		CartPage cartPage = new CartPage(driver);
		
		// Fetch productname from cart
		String actual = cartPage.getProductName();
		
		// verify correct product was added
		Assert.assertEquals(actual, "Sauce Labs Backpack");
	}

}
