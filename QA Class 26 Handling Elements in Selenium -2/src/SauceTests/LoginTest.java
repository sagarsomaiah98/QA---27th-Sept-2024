package SauceTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public void login() throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		try {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//span[@class='title']"));
		System.out.println("Login Test Passed");
		}
		catch(Exception e) {
		System.out.println("Login Test Failed");
		}
		Thread.sleep(2000);//pause time for 2 seconds
		driver.quit();
	}
	


	public static void main(String[] args) throws InterruptedException {
	

}
}
