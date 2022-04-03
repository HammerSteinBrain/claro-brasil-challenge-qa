package challenge.Pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import challenge.Components.Cart;

public class BasePage {
	protected WebDriver browser;

	public BasePage(WebDriver browser) {
		this.browser = browser;
	}
	
	
	//validation to check if cart has products
	public int ValidateCartWithProducts() {
		
		return Integer.parseInt(browser.findElement(By.className("ajax_cart_quantity")).getAttribute("innerText"));
		
	}
	
	//get individual value of each item and sum them  
	public double sumItemsTotal(List<Cart> cartItems) {
		
		double sum = 0;
		
		for (Cart item : cartItems) {
			sum = sum + item.getUnitPrice();
			
		}
		
		//trim the zeros
		sum = Math.round(sum*100)/100.0d;
		
		//System.out.println(sum);
		
		
		return sum;
	}
	
	//get total value of items
	public double getItemsTotal() {
			
			return Double.parseDouble(browser.findElement(By.cssSelector("#total_product")).getText().trim().substring(1));
			
	}
	

	// Randon Numbers Generator
	public static String RandomValues() {
		Random r = new Random();
		String number = "";

		// imprime sequencia de 8 numeros inteiros aleatorios entre 1 e 9
		for (int i = 0; i < 8; i++) {
			int randomNumber = r.nextInt(9);
			if (randomNumber != 0) {
				number = number + randomNumber;
			} else {
				number = number + 1;
			}
		}
		return number;
	}

}
