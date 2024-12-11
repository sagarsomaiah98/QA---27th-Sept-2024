package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class HomePage extends TestBase{

	public WebElement addtocart=driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
	public WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	public WebElement filter=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	public WebElement menu=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	public WebElement removeButton=driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
	
	public void addcart() {
		addtocart.click();
		cart.click();
		
	}
	
	public void removefromcart() {
		addtocart.click();
		removeButton.click();
		
	}
	
}
