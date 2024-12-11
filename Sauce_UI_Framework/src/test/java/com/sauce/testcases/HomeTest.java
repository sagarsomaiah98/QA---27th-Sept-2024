package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.HomePage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;

public class HomeTest extends TestBase {
	LoginPage loginpage;
	
	@BeforeMethod
	public void init() throws IOException {
		
		
		intialization();
		loginpage= new LoginPage();
		loginpage.login("standard_user", "secret_sauce");
		
	}
	
	
	@Test
	public void addtocarttest() {
		HomePage homepage=new HomePage();
		homepage.addcart();
		
	}
	
	
	@Test
	public void removecart() {
		HomePage homepage=new HomePage();
		homepage.removefromcart();
	}
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
	

}
