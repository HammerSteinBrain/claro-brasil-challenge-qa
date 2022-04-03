package challenge.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import challenge.Components.Cart;
import challenge.Pages.BasePage;
//Pages
import challenge.Pages.HomePage;
import challenge.Support.Web;

public class ChallengeAutomatedTests {
	private WebDriver browser;

	// Initial tests setup
	@BeforeEach
	public void setUp() {
		try {
			// Local driver receives driver returning from Start Method
			browser = Web.Start();

			// Go to URL
			browser.get("http://automationpractice.com/");

			// Maximizing the window of browser
			browser.manage().window().maximize();

		} catch (Throwable e) {
			System.out.println("Error setUp: " + e.getMessage());
		}
	}

	@Test
	@Order(1)
	public void CreateAccount() throws Exception {
		try {
			// BrowserStack Setting name of test
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionName\", \"arguments\":
			// {\"name\":\" Challenge createAccount \" }}");

			// test will fail if run lasts more than 5 minutes
			Assertions.assertTimeoutPreemptively(Duration.ofMinutes(5), () -> {

				// Status receives ValidatingMy_account string
				String Status = new HomePage(browser).clickBtnSign().TypingEmail().ClickCreateAccount()
						.EnteringPersonalData().ClickRegisterButton().ValidatingMy_account();

				// Compare text from Status with an expected text from Page
				assertEquals(
						"Welcome to your account. Here you can manage all of your personal information and orders.",
						Status);

				// Thread.sleep(5000);

			});

			// BrowserStack Test 'passed' label
			// ((JavascriptExecutor) browser).executeScript(
			// "browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\":
			// {\"status\":\"passed\"}}");

		} catch (Throwable e) {
			// BrowserStack Test 'failed' label
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\":
			// {\"status\":\"failed\"}}");

			System.out.println("Error on Test createAccount: " + e.getMessage());

			assertTrue(false);
		}

	}

	@Test
	@Order(2)
	public void DoLogin() throws Exception {
		try {
			// BrowserStack Setting name of test
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionName\", \"arguments\":
			// {\"name\":\" Challenge doLogin \" }}");

			// test will fail if run lasts more than 5 minutes
			Assertions.assertTimeoutPreemptively(Duration.ofMinutes(5), () -> {

				// Status receives ValidatingMy_account string
				String Status = new HomePage(browser).clickBtnSign().TypingLoginData().ClickSignInButton()
						.ValidatingMy_account();

				// Compare text from Status with an expected text from Page
				assertEquals(
						"Welcome to your account. Here you can manage all of your personal information and orders.",
						Status);

				// Thread.sleep(5000);

			});

			// BrowserStack Test 'passed' label
			// ((JavascriptExecutor) browser).executeScript(
			// "browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\":
			// {\"status\":\"passed\"}}");

		} catch (Throwable e) {
			// BrowserStack Test 'failed' label
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\":
			// {\"status\":\"failed\"}}");

			System.out.println("Error on Test doLogin: " + e.getMessage());

			assertTrue(false);
		}

	}

	@Test
	@Order(3)
	public void AddToCart() throws Exception {
		try {
			// BrowserStack Setting name of test
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionName\", \"arguments\":
			// {\"name\":\" Challenge doLogin \" }}");

			// test will fail if run lasts more than 5 minutes
			Assertions.assertTimeoutPreemptively(Duration.ofMinutes(5), () -> {

				new HomePage(browser).clickBtnSign().TypingLoginData().ClickSignInButton().GoToWomenPage()
						.AddProductsToCart();

				// Assert that has more than one product in the cart
				assertTrue(new BasePage(browser).ValidateCartWithProducts() > 1);

				// Thread.sleep(5000);

			});

			// BrowserStack Test 'passed' label
			// ((JavascriptExecutor) browser).executeScript(
			// "browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\":
			// {\"status\":\"passed\"}}");

		} catch (Throwable e) {
			// BrowserStack Test 'failed' label
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\":
			// {\"status\":\"failed\"}}");

			System.out.println("Error on Test AddProductsToCart: " + e.getMessage());

			assertTrue(false);
		}

	}

	@Test
	@Order(4)
	public void CartCheckout() throws Exception {
		try {
			// BrowserStack Setting name of test
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionName\", \"arguments\":
			// {\"name\":\" Challenge doLogin \" }}");

			// test will fail if run lasts more than 5 minutes
			Assertions.assertTimeoutPreemptively(Duration.ofMinutes(5), () -> {

				List<Cart> cartItems = new HomePage(browser).clickBtnSign().TypingLoginData().ClickSignInButton()
						.GoToWomenPage().AddProductsToCart().goToCheckoutPage().getShoppingCart();

				//System.out.println(cartItems.get(0).getProductName());
				
				//System.out.println(new BasePage(browser).sumItemsTotal(cartItems));
				//System.out.println(new BasePage(browser).getItemsTotal());
				
				//validate that the sum of each item is equal to the value of total cell
				assertEquals(new BasePage(browser).sumItemsTotal(cartItems), new BasePage(browser).getItemsTotal());

				//Thread.sleep(5000);

			});

			// BrowserStack Test 'passed' label
			// ((JavascriptExecutor) browser).executeScript(
			// "browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\":
			// {\"status\":\"passed\"}}");

		} catch (Throwable e) {
			// BrowserStack Test 'failed' label
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\":
			// {\"status\":\"failed\"}}");

			System.out.println("Error on Test CartCheckout: " + e.getMessage());

			assertTrue(false);
		}

	}

	// Quit browser method
	@AfterEach
	public void tearDown() {
		// Close Driver
		browser.quit();
	}
}