package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.testbase.TestBase;
import com.sauce.testuill.TestUtil;

public class HomePage extends TestBase{

@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
public WebElement addtocart;

@FindBy(xpath="//a[@class='shopping_cart_link']")
public WebElement cart;

@FindBy(xpath="//select[@class='product_sort_container']")
public WebElement filter;	

@FindBy(xpath="//button[@id='react-burger-menu-btn']")
public WebElement menu;

@FindBy(xpath="//button[@id='remove-sauce-labs-backpack']")
public WebElement removeButton;

@FindBy(xpath="//a[@id='logout_sidebar_link']")
public WebElement logout;
	

public HomePage(){
	
	PageFactory.initElements(driver, this);
	
}
	public void addcart() {
		addtocart.click();
		cart.click();
		
	}
	
	public void removefromcart() {
		addtocart.click();
		removeButton.click();
		
	}
	
	public void filterItems(String dropdownValue) {
		TestUtil.selectDropDownByValues(filter, dropdownValue);
	}
	
	public void logout() {
		menu.click();
		logout.click();
		
	}
	
}
