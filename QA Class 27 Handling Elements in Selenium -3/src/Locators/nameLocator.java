package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(1000);		// TODO Auto-generated method stub
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
driver.findElement(By.name("password")).sendKeys("secret_sauce");
driver.findElement(By.name("login-button")).click();
driver.quit();
	}

}
