import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//click on radio button
		driver.findElement(By.xpath("//input[@id='vfb-7-1']")).click();
		
		Thread.sleep(1000);
		
		//click on checkbox
		
		driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();

	}

}
