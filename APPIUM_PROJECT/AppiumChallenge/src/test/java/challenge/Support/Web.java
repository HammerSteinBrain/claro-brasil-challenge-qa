package challenge.Support;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class Web {

	@SuppressWarnings("rawtypes")
	public static AndroidDriver android_driver;
	@SuppressWarnings("rawtypes")
	public static IOSDriver ios_driver;
	
	
	@SuppressWarnings("rawtypes")
	public static AndroidDriver Start_android() {
		try {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("platformName", "Android");
		    desiredCapabilities.setCapability("deviceName", "emulator-5554");
		    desiredCapabilities.setCapability("automationName", "uiautomator2");
		    desiredCapabilities.setCapability("appPackage", "com.example.leonardomenezes.simplecalculatorandroid");
		    desiredCapabilities.setCapability("appActivity", "com.example.leonardomenezes.simplecalculatorandroid.MainActivity");
			

			URL remoteUrl = new URL("http://localhost:4723/wd/hub");

			android_driver = new AndroidDriver(remoteUrl, desiredCapabilities);
		} catch (Throwable e) {
			System.out.println("Error setUp: " + e.getMessage());
		}
		
		return android_driver;
		
	}
	@SuppressWarnings("rawtypes")
	public static IOSDriver Start_ios() {
		try {
			DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		    desiredCapabilities.setCapability("app", "/Users/rodrigolopes/Desktop/SimpleCalculator.app");
		    desiredCapabilities.setCapability("deviceName", "iPhone 8 Plus");
		    desiredCapabilities.setCapability("udid", "BE891D50-E3C0-4D9C-8922-0A6A9B6705A2");
		    desiredCapabilities.setCapability("platformName", "ios");
		    desiredCapabilities.setCapability("platformVersion", "14.4");
		    desiredCapabilities.setCapability("showXcodeLog", true);
		    desiredCapabilities.setCapability("includeSafariInWebviews", true);
			

			URL remoteUrl = new URL("http://localhost:4723/wd/hub");

			ios_driver = new IOSDriver(remoteUrl, desiredCapabilities);

		} catch (Throwable e) {
			System.out.println("Error setUp: " + e.getMessage());
		}
		
		return ios_driver;
		
	}
	
	
}
