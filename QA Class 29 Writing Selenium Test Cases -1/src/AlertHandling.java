
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	//https://chercher.tech/practice/practice-pop-ups-selenium-webdriver

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		Alert al=driver.switchTo().alert();
		Thread.sleep(2000);
		String txt=al.getText();
		//al.accept();// click ok on alert
		al.dismiss(); //click on cancel
		
		System.out.println(txt);
		driver.quit();
		
	}

}
