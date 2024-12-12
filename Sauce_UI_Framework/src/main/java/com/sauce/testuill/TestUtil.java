package com.sauce.testuill;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.sauce.testbase.TestBase;

public class TestUtil extends TestBase{
	
	public static String DateTime() {
		LocalDateTime myDateObj = LocalDateTime.now();
		   
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");

	    String formattedDate = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	    
	   return formattedDate;
	    
	}
	
	public static void Screenshot() throws IOException   {
		
		     String name=driver.getTitle()+"_"+DateTime();

			TakesScreenshot scrShot = ((TakesScreenshot) driver);

			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			
			System.out.println(System.getProperty("user.dir") +"\\SCREENSHOTS\\");

			File DestFile = new File(System.getProperty("user.dir") + "\\SCREENSHOTS\\" +  name+".jpeg");

			FileUtils.copyFile(SrcFile, DestFile);
		}
	
	

	public static void main(String[] args) {
		DateTime(); 

	}
	
	public static void selectDropDownByValues(WebElement dropdown,String value) {
		
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
public static void selectDropDownByIndex(WebElement dropdown,String index) {
		
		Select select = new Select(dropdown);
		select.selectByValue(index);
	}

public static void selectDropDownByText(WebElement dropdown,String text) {
	
	Select select = new Select(dropdown);
	select.selectByContainsVisibleText(text);
}

public static void alertHandling() {
	Alert al=driver.switchTo().alert();
	al.accept();
}

}
