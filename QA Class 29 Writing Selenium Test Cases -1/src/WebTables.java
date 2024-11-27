import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
	WebElement table=driver.findElement(By.xpath("//table[@id='table1']/tbody"));
	List<WebElement> rows=table.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	
	//String value=rows.get(1).findElement(By.tagName("td")).getText();
	//System.out.println(value);
	
	List<WebElement> col1= rows.get(0).findElements(By.tagName("td"));
	List<WebElement> col2= rows.get(1).findElements(By.tagName("td"));
	List<WebElement> col3= rows.get(2).findElements(By.tagName("td"));
	

	for(int i=0;i<3;i++) {
		System.out.print(col1.get(i).getText());
		System.out.print(col2.get(i).getText());
		System.out.print(col3.get(i).getText());
		System.out.println();
		
	}
	
	}

}
