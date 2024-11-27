import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;







public class Drop_Down  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropDown=driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		
        Select sel = new Select(dropDown);
        //select by index
        sel.selectByIndex(10);
        
        Thread.sleep(2000);
        //select by value
        sel.selectByValue("AUS");
        
        
        Thread.sleep(2000);
        //select by text
        
        sel.selectByVisibleText("Canada");
        
        //how to get the values from drop down
        
        List<WebElement> options=sel.getOptions();
        System.out.println(options.size());
        
        for(int i=0;i<options.size();i++) {
        	
        	System.out.println(options.get(i).getText());
        }
        
        driver.quit();
        
    
		 

	}

}
