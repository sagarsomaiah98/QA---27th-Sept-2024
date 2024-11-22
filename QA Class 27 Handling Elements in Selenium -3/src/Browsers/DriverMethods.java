package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		String pageSource=driver.getPageSource();
		driver.manage().window().minimize();
System.out.println(pageSource);
//driver.close();
driver.quit();
	}

}
