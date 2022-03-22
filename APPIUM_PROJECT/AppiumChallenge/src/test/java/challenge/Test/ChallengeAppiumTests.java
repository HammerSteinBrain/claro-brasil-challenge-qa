package challenge.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.MalformedURLException;
import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import challenge.Pages.HomePage;
import challenge.Support.Web;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class ChallengeAppiumTests {
	@SuppressWarnings("rawtypes")
	private AndroidDriver android_driver;
	@SuppressWarnings("rawtypes")
	private IOSDriver ios_driver;
	private String result;

	private String Platform;


	@BeforeEach
	public void setUp() throws MalformedURLException {
		try {
			// Getting environment variable PLATFORM content
			if ((System.getProperty("_PLATFORM") == null)) {

				// set by DEFAULT android in case of null environment variable
				Platform = "android";
				
				// Local android_driver receives driver returning from Start Method
				this.android_driver = Web.Start_android();


			} else {
				// Getting environment variable PLATFORM content
				Platform = System.getProperty("_PLATFORM");

				System.out.println("Chosen Platform    =  "+(System.getProperty("_PLATFORM")));

				if (Platform.equals("android")) {

					// Local android_driver receives driver returning from Start Method
					this.android_driver = Web.Start_android();

				} else if (Platform.equals("ios")) {

					// Local ios_driver receives driver returning from Start Method
					this.ios_driver = Web.Start_ios();

				}

			}

		} catch (Throwable e) {
			System.out.println("Erro setUp: " + e.getMessage());
		}
	}

	@Test
	@Order(1)
	// Perform a Sum of 10 plus 20
	public void PerformSum() {
		try {
			// BrowserStack Setting name of test
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionName\", \"arguments\":
			// {\"name\":\" Challenge PerformSum \" }}");

			// test will fail if run lasts more than 5 minutes
			Assertions.assertTimeoutPreemptively(Duration.ofMinutes(5), () -> {

				if (Platform.equals("android")) {
					// Perform a Sum for android
					result = new HomePage(android_driver).PerformSum_android();

				} else if (Platform.equals("ios")) {
					// Perform a Sum for ios
					result = new HomePage(ios_driver).PerformSum_IOS();
				}

				// Validating that result exhibited is '30'
				assertEquals("30", result);

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

			System.out.println("Error on Test PerformSum: " + e.getMessage());

			assertTrue(false);
		}
	}

	@Test
	@Order(2)
	// Perform a Subtraction of 20 by 5
	public void PerformSubtraction() {
		try {
			// BrowserStack Setting name of test
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionName\", \"arguments\":
			// {\"name\":\" Challenge PerformSubtraction \" }}");

			// test will fail if run lasts more than 5 minutes
			Assertions.assertTimeoutPreemptively(Duration.ofMinutes(5), () -> {

				if (Platform.equals("android")) {
					// Perform a Sum for android
					result = new HomePage(android_driver).PerformSubtraction_android();

				} else if (Platform.equals("ios")) {
					// Perform a Sum for ios
					result = new HomePage(ios_driver).PerformSubtraction_ios();
				}

				// Validating that result exhibited is '15'
				assertEquals("15", result);

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

			System.out.println("Error on Test PerformSubtraction: " + e.getMessage());

			assertTrue(false);
		}
	}

	@Test
	@Order(3)
	// Perform a Multiplication of 5 times 20
	public void PerformMultiplication() {
		try {
			// BrowserStack Setting name of test
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionName\", \"arguments\":
			// {\"name\":\" Challenge PerformMultiplication \" }}");

			// test will fail if run lasts more than 5 minutes
			Assertions.assertTimeoutPreemptively(Duration.ofMinutes(5), () -> {

				if (Platform.equals("android")) {
					// Perform a Sum for android
					result = new HomePage(android_driver).PerformMultiplication_android();

				} else if (Platform.equals("ios")) {
					// Perform a Sum for ios
					result = new HomePage(ios_driver).PerformMultiplication_ios();
				}

				// Validating that result exhibited is '100'
				assertEquals("100", result);

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

			System.out.println("Error on Test PerformMultiplication: " + e.getMessage());

			assertTrue(false);
		}
	}

	@Test
	@Order(4)
	// Perform a division of 100 by 4
	public void PerformDivision() {
		try {
			// BrowserStack Setting name of test
			// JavascriptExecutor jse = (JavascriptExecutor) browser;
			// jse.executeScript(
			// "browserstack_executor: {\"action\": \"setSessionName\", \"arguments\":
			// {\"name\":\" Challenge PerformDivision \" }}");

			// test will fail if run lasts more than 5 minutes
			Assertions.assertTimeoutPreemptively(Duration.ofMinutes(5), () -> {

				if (Platform.equals("android")) {
					// Perform a Sum for android
					result = new HomePage(android_driver).PerformDivision_android();

				} else if (Platform.equals("ios")) {
					// Perform a Sum for ios
					result = new HomePage(ios_driver).PerformDivision_ios();
				}

				// Validating that result exhibited is '25'
				assertEquals("25", result);
				
				
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

			System.out.println("Error on Test PerformDivision: " + e.getMessage());

			assertTrue(false);
		}
	}

	@AfterEach
	public void tearDown() {

		if (Platform.equals("android")) {
			// quit when android
			android_driver.quit();

		} else if (Platform.equals("ios")) {
			// quit when ios
			ios_driver.quit();
		}

	}

}
