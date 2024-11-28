

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/?locale=in");
	driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
	
	
	Set<String> wins=driver.getWindowHandles();
	System.out.println(wins.size());
	
	Iterator<String> it =wins.iterator();
	String parent=it.next();
	String child=it.next();
	System.out.println(parent);
	System.out.println(child);
	driver.switchTo().window(child);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[normalize-space()='Learn more']")).click();
	
	driver.quit();
	
	
		
	
	}

}
