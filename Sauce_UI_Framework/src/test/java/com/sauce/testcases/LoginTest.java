package com.sauce.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.testuill.TestUtil;

public class LoginTest extends TestBase {
	
	LoginPage loginpage;
	
	@BeforeMethod
	public void init() throws IOException {
		
		intialization();//launch browser and navigate to url
		loginpage= new LoginPage();
	}
	
	@Test(priority=1)
	public void validLoginTest() throws IOException {
		boolean flag=true;
		
		
		try {
		loginpage.login("standard_user", "secret_sauce");
		driver.findElement(By.xpath("//span[@class='title']"));
		
		}
		catch(Exception e) {
			flag=false;
			TestUtil.Screenshot();
		}
		
		assertEquals(flag, true);
	   
					
	}

	
	@Test(priority=2)
	public void invalidLoginTest() throws IOException {
		
		try {
		loginpage.login("username1", "secret_sauce");
		}
		catch(Exception e) {
		TestUtil.Screenshot();
		e.printStackTrace();
		}
		
	}
	
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
}
