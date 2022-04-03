package challenge.Components;

import org.openqa.selenium.WebElement;

public class Cart {

	public Cart() {
		// super(browser);
		// TODO Auto-generated constructor stub
	}
	
	//variables
	private String SKU;
	private String color;
	private boolean inStock;
	private double unitPrice;
	private int quantity;
	private double totalPrice;

	private WebElement productImageLink;
	private WebElement productNameLink;
	private WebElement increaseQuantityButton;
	private WebElement decreaseQuantityButton;
	private WebElement removeProductButton;
	private String productName;
	
	
	//getters and setters
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public WebElement getProductImageLink() {
		return productImageLink;
	}
	public void setProductImageLink(WebElement productImageLink) {
		this.productImageLink = productImageLink;
	}
	public WebElement getProductNameLink() {
		return productNameLink;
	}
	public void setProductNameLink(WebElement productNameLink) {
		this.productNameLink = productNameLink;
	}
	public WebElement getIncreaseQuantityButton() {
		return increaseQuantityButton;
	}
	public void setIncreaseQuantityButton(WebElement increaseQuantityButton) {
		this.increaseQuantityButton = increaseQuantityButton;
	}
	public WebElement getDecreaseQuantityButton() {
		return decreaseQuantityButton;
	}
	public void setDecreaseQuantityButton(WebElement decreaseQuantityButton) {
		this.decreaseQuantityButton = decreaseQuantityButton;
	}
	public WebElement getRemoveProductButton() {
		return removeProductButton;
	}
	public void setRemoveProductButton(WebElement removeProductButton) {
		this.removeProductButton = removeProductButton;
	}

	

}
