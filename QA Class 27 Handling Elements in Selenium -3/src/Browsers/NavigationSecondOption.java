package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationSecondOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.bing.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com");
         Thread.sleep(1000);
         driver.navigate().back();
         Thread.sleep(1000);
         driver.navigate().forward();
         Thread.sleep(1000);
         driver.navigate().refresh();
	}

}
