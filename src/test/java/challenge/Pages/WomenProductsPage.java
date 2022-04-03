package challenge.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomenProductsPage extends BasePage {

	public WomenProductsPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
	}

	public WomenProductsPage AddProductsToCart() {

		// scroll to product grid
		((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);",
				browser.findElement(By.xpath("//*[@class='product_list grid row']")));

		// wait until product is visible on the page
		new WebDriverWait(browser, 10).until(
				ExpectedConditions.visibilityOf(browser.findElement(By.xpath("//*[@data-id-product='1']/../../.."))));

		// move mouse over product
		new Actions(browser).moveToElement(browser.findElement(By.xpath("//*[@data-id-product='1']/../../.."))).build()
				.perform();

		// waits for product's button add to car is visible
		new WebDriverWait(browser, 10).until(ExpectedConditions.visibilityOf(browser.findElement(
				By.xpath("//*[@data-id-product='1' and @class='button ajax_add_to_cart_button btn btn-default']"))));

		// click button add to cart
		browser.findElement(
				By.xpath("//*[@data-id-product='1' and @class='button ajax_add_to_cart_button btn btn-default']"))
				.click();

		// waits for continue shopping's button is visible
		new WebDriverWait(browser, 10).until(ExpectedConditions.visibilityOf(browser.findElement(By.cssSelector(
				"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span"))));

		// click button continue shopping's button
		browser.findElement(By.cssSelector(
				"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span"))
				.click();

		// Product 2

		// scroll to product grid
		// ((JavascriptExecutor)
		// browser).executeScript("arguments[0].scrollIntoView(true);",
		// browser.findElement(By.xpath("//*[@class='product_list grid row']")));

		// wait until product is visible on the page
		new WebDriverWait(browser, 10).until(
				ExpectedConditions.visibilityOf(browser.findElement(By.xpath("//*[@data-id-product='2']/../../.."))));

		// move mouse over product
		new Actions(browser).moveToElement(browser.findElement(By.xpath("//*[@data-id-product='2']/../../.."))).build()
				.perform();

		// waits for product's button add to car is visible
		new WebDriverWait(browser, 10).until(ExpectedConditions.visibilityOf(browser.findElement(
				By.xpath("//*[@data-id-product='2' and @class='button ajax_add_to_cart_button btn btn-default']"))));

		// click button add to cart
		browser.findElement(
				By.xpath("//*[@data-id-product='2' and @class='button ajax_add_to_cart_button btn btn-default']"))
				.click();

		// waits for continue shopping's button is visible
		new WebDriverWait(browser, 10).until(ExpectedConditions.visibilityOf(browser.findElement(By.cssSelector(
				"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span"))));

		// click button continue shopping's button
		browser.findElement(By.cssSelector(
				"#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > span"))
				.click();

		// scroll to cart
		((JavascriptExecutor) browser).executeScript("arguments[0].scrollIntoView(true);",
				browser.findElement(By.className("shopping_cart")));

		return this;
	}

	public CheckoutPage goToCheckoutPage() {

		// move mouse over Cart
		new Actions(browser).moveToElement(browser.findElement(By.cssSelector("#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a"))).build().perform();
		
		
		new WebDriverWait(browser,10).until(ExpectedConditions.visibilityOf(browser.findElement(By.cssSelector("#button_order_cart"))));
		
		
		browser.findElement(By.cssSelector("#button_order_cart")).click();

		return new CheckoutPage(browser);
	}

}
