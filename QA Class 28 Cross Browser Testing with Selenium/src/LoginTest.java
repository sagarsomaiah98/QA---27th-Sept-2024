import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			//code to login 
		driver.get("https://www.saucedemo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce1");
	   driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   driver.findElement(By.xpath("//span[@class='title']"));
	   System.out.println("Login Test Passsed");
		}
		catch(Exception e) {
			
			System.out.println("Login Test Failed");
			String error=driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]")).getText();
			System.out.println(error);
		}
		
	
	   driver.quit();
	

	}

	

	public static void main(String[] args) throws InterruptedException {
	}
		
}
