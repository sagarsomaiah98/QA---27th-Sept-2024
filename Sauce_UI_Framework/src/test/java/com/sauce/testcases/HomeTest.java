package com.sauce.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.pages.HomePage;
import com.sauce.pages.LoginPage;
import com.sauce.testbase.TestBase;
import com.sauce.testuill.TestUtil;

public class HomeTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	
	@BeforeMethod
	public void init() throws IOException {
		
		
		intialization();//launch browser and navigate
		loginpage= new LoginPage();
		loginpage.login("standard_user", "secret_sauce");
		homepage=new HomePage();
		
	}
	
	
	@Test
	public void addtocarttest() throws IOException {
		try {
		
		homepage.addcart();
		}
		catch(Exception e) {
			TestUtil.Screenshot();
			e.printStackTrace();
		}
		
		
	}
	
	
	@Test
	public void removecart() throws IOException {
	     try {
		homepage.removefromcart();
	     }
	     catch(Exception e) {
	    	 
		TestUtil.Screenshot();
		e.printStackTrace();
	}
	}
	
	@Test
	public void sort() throws IOException, InterruptedException {
		
		try {
	
		homepage.filterItems("lohi");
		Thread.sleep(2000);
		}
		catch(Exception e) {
		TestUtil.Screenshot();
		e.printStackTrace();
	}}
	
	@Test
	public void logout() throws IOException {
        try {
		homepage.logout();
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
