package com.sauce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.sauce.testbase.TestBase;

public class LoginPage extends TestBase {
	
	public WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
	public WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	public WebElement loginButton=driver.findElement(By.xpath("//input[@id='login-button']"));
	
	
	public void login(String uname, String pwd) {
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
	}
	

}
