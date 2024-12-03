import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLogin_Excel_Data {

	public static void main(String[] args) {
		
Xls_Reader xls = new Xls_Reader("S:\\JANBASK\\QA - 27th Sept 2024\\QA Class 31 Data Parameterization\\src\\TestSuite\\SAUCE_LOGIN.xlsx");
		
	
		
		int rowCount=xls.getRowCount("SAUCE");
		System.out.println(rowCount);
		
		for(int i=2;i<=rowCount;i++) {
			String username=xls.getCellData("SAUCE", "USERNAME", i);
			String password=xls.getCellData("SAUCE", "PASSWORD", i);
			
			System.out.print(username+" | "+password);
			System.out.println();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com");
			
			driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
			
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		   driver.findElement(By.xpath("//input[@id='login-button']")).click();
		  
		  driver.quit();
		 
			
			
		}
		
		
		
			
		
	
	
	

	}

		
	
		 
		
		

	}


