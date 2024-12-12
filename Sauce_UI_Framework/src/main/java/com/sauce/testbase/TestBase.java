package com.sauce.testbase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	Properties prop ;
	FileInputStream fis;
	public static WebDriver driver;
	
	public  void intialization() throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\sauce\\config\\config.properties");
		prop.load(fis);
		String browserType=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		switch(browserType) 
		{
		case "chrome":
		driver= new ChromeDriver();
		break;
		case "firefox":
		driver= new FirefoxDriver();
		break;
		case "edge":
		driver=new EdgeDriver();
		break;
		default:
		System.out.print("Browser not supported");	
		
		}
		driver.manage().window().maximize();
		driver.get(url);
	   int timeout=Integer.parseInt(prop.getProperty("timeout"));
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
