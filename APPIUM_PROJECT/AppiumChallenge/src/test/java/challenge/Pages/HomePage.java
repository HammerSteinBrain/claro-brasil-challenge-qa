package challenge.Pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class HomePage {
	@SuppressWarnings("rawtypes")
	private AndroidDriver android_driver;
	@SuppressWarnings("rawtypes")
	public IOSDriver ios_driver;

	public HomePage(@SuppressWarnings("rawtypes") AndroidDriver android_driver) {
		this.android_driver = android_driver;

	}

	public HomePage(@SuppressWarnings("rawtypes") IOSDriver ios_driver) {
		this.ios_driver = ios_driver;

	}

	// Method to Perform Sum operation for Android
	public String PerformSum_android() {

		// get first_input element
		// MobileElement first_input_ios = (MobileElement)
		// driver.findElementByAccessibilityId("apple_first_input");
		MobileElement first_input_android = (MobileElement) android_driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_first_number");

		// type a value on first_input
		first_input_android.sendKeys("10");

		// get second_input element
		// MobileElement second_input_ios = (MobileElement)
		// driver.findElementByAccessibilityId("apple_second_input");
		MobileElement second_input_android = (MobileElement) android_driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number");

		// type a value on second_input
		second_input_android.sendKeys("20");

		// get sum_button element
		// MobileElement sum_ios = (MobileElement)
		// driver.findElementByAccessibilityId("apple-sum-button");
		MobileElement sum_android = (MobileElement) android_driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_sum");

		// perform a click on sum_button element
		sum_android.click();

		// get result text element
		// MobileElement result_text_ios = (MobileElement)
		// driver.findElementByAccessibilityId("apple_result_text");
		MobileElement result_text_android = (MobileElement) android_driver
				.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text");

		return result_text_android.getText();
	}

	// Method to Perform Sum operation for IOS
	public String PerformSum_IOS() {

		// get first_input element
		MobileElement first_input_ios = (MobileElement) ios_driver.findElementByAccessibilityId("apple_first_input");

		// type a value on first_input
		first_input_ios.sendKeys("10");

		// get second_input element
		MobileElement second_input_ios = (MobileElement) ios_driver.findElementByAccessibilityId("apple_second_input");

		// type a value on second_input
		second_input_ios.sendKeys("20");

		// get sum_button element
		MobileElement sum_ios = (MobileElement) ios_driver.findElementByAccessibilityId("apple-sum-button");

		// perform a click on sum_button element
		sum_ios.click();

		// get result text element
		MobileElement result_text_ios = (MobileElement) ios_driver.findElementByAccessibilityId("apple_result_text");


		return result_text_ios.getText();
	}
	
	// Method to Perform a Subtraction of 20 by 5 for android
	public String PerformSubtraction_android() {
		
		//get first_input element
		MobileElement first_input = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_first_number");
		
		//type a value on first_input
		first_input.sendKeys("20");
		
		//get second_input element
	    MobileElement second_input = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number");
	    
	    //type a value on second_input
	    second_input.sendKeys("5");
	    
	    //get subtract-button element
	    MobileElement subtract = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_sub");
	    
	    //perform a click on subtract_button element
	    subtract.click();
	    
	    //get result text element
	    MobileElement result_text = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text");
		
	    
		return result_text.getText();
	}
	
	// Method to Perform a Subtraction of 20 by 5 for ios
	public String PerformSubtraction_ios() {
		
		//get first_input element
		MobileElement first_input = (MobileElement) ios_driver.findElementByAccessibilityId("apple_first_input");
		
		//type a value on first_input
		first_input.sendKeys("20");
		
		//get second_input element
	    MobileElement second_input = (MobileElement) ios_driver.findElementByAccessibilityId("apple_second_input");
	    
	    //type a value on second_input
	    second_input.sendKeys("5");
	    
	    //get subtract-button element
	    MobileElement subtract = (MobileElement) ios_driver.findElementByAccessibilityId("apple-subtract-button");
	    
	    //perform a click on subtract_button element
	    subtract.click();
	    
	    //get result text element
	    MobileElement result_text = (MobileElement) ios_driver.findElementByAccessibilityId("apple_result_text");
		
		
		return  result_text.getText();
	}
	
	//Perform a multiplication of 5 times 20 for android
	public String PerformMultiplication_android() {
		//get first_input element
		MobileElement first_input = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_first_number");
		
		//type a value on first_input
		first_input.sendKeys("20");
		
		//get second_input element
	    MobileElement second_input = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number");
	    
	    //type a value on second_input
	    second_input.sendKeys("5");
	    
	    //get multiply-button element
	    MobileElement multiply = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_mult");
	    
	    //perform a click on multiply_button element
	    multiply.click();
	    
	    //get result text element
	    MobileElement result_text = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text");
		
	    
		return result_text.getText();
	}
	
	//Perform a multiplication of 5 times 20 for ios
	public String PerformMultiplication_ios() {
		//get first_input element
		MobileElement first_input = (MobileElement) ios_driver.findElementByAccessibilityId("apple_first_input");
		
		//type a value on first_input
		first_input.sendKeys("20");
		
		//get second_input element
	    MobileElement second_input = (MobileElement) ios_driver.findElementByAccessibilityId("apple_second_input");
	    
	    //type a value on second_input
	    second_input.sendKeys("5");
	    
	    //get multiply-button element
	    MobileElement multiply = (MobileElement) ios_driver.findElementByAccessibilityId("apple-multiply-button");
	    
	    //perform a click on multiply_button element
	    multiply.click();
	    
	    //get result text element
	    MobileElement result_text = (MobileElement) ios_driver.findElementByAccessibilityId("apple_result_text");
		
		return result_text.getText();
	}
	
	//performing a division of 100 by 4 for android
	public String PerformDivision_android(){
		// get first_input element
		MobileElement first_input = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_first_number");

		// type a value on first_input
		first_input.sendKeys("100");

		// get second_input element
		MobileElement second_input = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_field_second_number");

		// type a value on second_input
		second_input.sendKeys("4");

		// get multiply-button element
		MobileElement divide = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_button_div");

		// perform a click on divide_button element
		divide.click();

		// get result text element
		MobileElement result_text = (MobileElement) android_driver.findElementById("com.example.leonardomenezes.simplecalculatorandroid:id/android_result_text");

		return result_text.getText();
	}
	
	//performing a division of 100 by 4 for ios
	public String PerformDivision_ios() {
		
		// get first_input element
		MobileElement first_input = (MobileElement) ios_driver.findElementByAccessibilityId("apple_first_input");

		// type a value on first_input
		first_input.sendKeys("100");

		// get second_input element
		MobileElement second_input = (MobileElement) ios_driver.findElementByAccessibilityId("apple_second_input");

		// type a value on second_input
		second_input.sendKeys("4");

		// get multiply-button element
		MobileElement divide = (MobileElement) ios_driver.findElementByAccessibilityId("apple-divide-button");

		// perform a click on divide_button element
		divide.click();

		// get result text element
		MobileElement result_text = (MobileElement) ios_driver.findElementByAccessibilityId("apple_result_text");

		return result_text.getText();
	}
	

}
