package challenge.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import challenge.Components.Cart;



public class CheckoutPage  extends BasePage{

	public CheckoutPage(WebDriver browser) {
		super(browser);
		// TODO Auto-generated constructor stub
		
		new WebDriverWait(browser,10).until(ExpectedConditions.visibilityOfElementLocated(By.id("cart_summary")));
	}
	
	
	//method to get table shopping cart summary content
	public List<Cart> getShoppingCart() throws Exception {
		
		//new cart array list
        List<Cart> cart = new ArrayList<Cart>();
        
        //new table array to receive all rows from table
        List<WebElement> table = browser.findElements(By.xpath("//*[@id='cart_summary']/tbody/tr"));
        
        //for each row in table
        for (WebElement row : table) {
        	
        	//new item for the cart
        	Cart Item = new Cart();
        	
        	//setting item properties from table
        	Item.setProductName(row.findElement( By.cssSelector("td.cart_description > p.product-name > a")).getText().trim());
        	
        	Item.setSKU(row.findElement(By.cssSelector("td.cart_description > small.cart_ref")).getText().trim());
        	
        	Item.setColor(row.findElement(By.cssSelector("td.cart_description > small:nth-child(3) > a")).getText().trim());
        	
        	Item.setInStock(row.findElement(By.cssSelector("td.cart_avail > span")).getText().trim().toLowerCase().equals("in stock"));
        	
            Item.setUnitPrice(Double.parseDouble(row.findElement(By.cssSelector("td.cart_unit > span.price > span.price")).getText().trim().substring(1)));
              
            Item.setQuantity(Integer.parseInt(row.findElement(By.cssSelector("td.cart_quantity > input.cart_quantity_input")).getAttribute("value")));
            
            Item.setTotalPrice(Double.parseDouble(row.findElement(By.cssSelector("td.cart_total > span.price")).getText().trim().substring(1)));

            Item.setProductImageLink(row.findElement(By.cssSelector("td.cart_product > a")));
            
            Item.setProductNameLink(row.findElement(By.cssSelector("td.cart_product > a")));
            
            Item.setIncreaseQuantityButton(row.findElement(By.cssSelector("td.cart_product > a")));
            
            Item.setDecreaseQuantityButton(row.findElement(By.cssSelector("td.cart_product > a")));
            
            Item.setRemoveProductButton(row.findElement(By.cssSelector("td.cart_product > a")));

            //adding this new item to cart
            cart.add(Item);
        }

        //returning the cart with all items added
        return cart;
    }

}
