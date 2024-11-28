import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFilling {
	static WebDriver driver; 
	
	public static int random() {
		
		int id=(int) (Math.random()*10000);
		
		
		
		return id;
	}
	
	public static void type(String xpath,String value) {
		
		driver.findElement(By.xpath(xpath)).sendKeys(value);
		
	}

	public static void main(String[] args) {
		
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		type("//input[@id='customer.firstName']","John");
		type("//input[@id='customer.lastName']","kevin");
		type("//input[@id='customer.address.street']","24 bakers street");
		type("//input[@id='customer.address.city']","Newyork");
		type("//input[@id='customer.address.state']","NSW");
		type("//input[@id='customer.address.zipCode']","2156");
		type("//input[@id='customer.phoneNumber']","0165396896");
		type("//input[@id='customer.ssn']","3242432432");
		type("//input[@id='customer.username']","John"+random());
		type("//input[@id='customer.password']","123456");
		type("//input[@id='repeatedPassword']","123456");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		driver.quit();

	}

}
