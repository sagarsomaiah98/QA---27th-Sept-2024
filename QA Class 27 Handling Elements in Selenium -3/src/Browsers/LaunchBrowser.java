package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
	    WebDriver driver = new ChromeDriver();
		WebDriver driver1= new FirefoxDriver();
		WebDriver driver2= new EdgeDriver();

	}

}
