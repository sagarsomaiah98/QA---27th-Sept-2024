import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestValidation {
	
	@Test
	public void login() throws InterruptedException {
		boolean flag=true;	
		WebDriver driver= new ChromeDriver();
		try {
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		driver.findElement(By.xpath("//span[@class='title']"));
		
		}
		catch(Exception e) {
	
			flag=false;
		}
		Thread.sleep(2000);//pause time for 2 seconds
	
		driver.quit();
		assertEquals(flag, true,"Login was unsucessful ");
	}
		
		
	}


