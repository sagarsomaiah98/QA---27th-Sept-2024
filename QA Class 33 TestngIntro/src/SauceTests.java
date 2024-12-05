import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceTests {
	
	@Test
	public void Login() {
		
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.saucedemo.com");
	     driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	     driver.findElement(By.xpath("//input[@id='login-button']")).click();
	     driver.quit();

		
	}
	
	@Test
	public void cartTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
	driver.findElement(By.xpath("//span[@class='shopping_cart_badge']")).click();
	String price=driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
	System.out.println(price);
	driver.quit();
	}

	@Test
	public void logoutTest() {
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.saucedemo.com");
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	driver.findElement(By.xpath("//button[@id='react-burger-menu-btn1']")).click();
	
	driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		
	
		
	driver.quit();
	}
}
