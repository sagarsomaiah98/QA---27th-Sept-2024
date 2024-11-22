package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		//ctrl+shift+o
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");

	}

}
