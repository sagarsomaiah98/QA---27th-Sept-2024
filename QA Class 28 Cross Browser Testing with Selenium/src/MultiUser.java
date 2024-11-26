import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiUser {
	
	public void logintest(String uname, String pwd) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			//code to login 
		driver.get("https://www.saucedemo.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	   driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   driver.findElement(By.xpath("//span[@class='title']"));
	   System.out.println(uname+ "->Login Test Passsed");
		}
		catch(Exception e) {
			
			System.out.println(uname+ "->Login Test Failed");
			
		}
		
	
	   driver.quit();
	

	
	}

	public static void main(String[] args) {
		MultiUser m= new MultiUser();
		m.logintest("standard_user", "secret_sauce");
		m.logintest("locked_out_user", "secret_sauce");
		m.logintest("problem_user", "secret_sauce");
		m.logintest("performance_glitch_user", "secret_sauce");
		m.logintest("error_user", "secret_sauce");
		m.logintest("visual_user", "secret_sauce");	

	}

}
