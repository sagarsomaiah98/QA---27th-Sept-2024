import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class OrangeHRMTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
  

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

       
            // Maximize the browser window and set an implicit wait
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            // Navigate to the OrangeHRM demo site
            driver.get("https://opensource-demo.orangehrmlive.com/");

            // Login with valid credentials
            WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
            WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            username.sendKeys("Admin");
            password.sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // Verify successful login by checking the dashboard
            String dashboardHeader = driver.findElement(By.tagName("h6")).getText();
            if (dashboardHeader.equals("Dashboard")) {
                System.out.println("Login successful and dashboard loaded!");
            } else {
                System.out.println("Login failed.");
                return;
            }

            // Navigate to the PIM (Personnel Information Management) module
            driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();

            // Add a new employee
            driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
            driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
            driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Doe");
            WebElement empId = driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
            String employeeId = empId.getAttribute("value");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            // Verify that the employee was added
            driver.findElement(By.xpath("//a[normalize-space()='Employee List']")).click();
            driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")).sendKeys(employeeId);
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            List<WebElement> searchResults = driver.findElements(By.xpath("//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable']"));
            if (searchResults.size() == 1) {
                System.out.println("Employee successfully added: " + employeeId);
            } else {
                System.out.println("Employee addition failed.");
            }

            // Edit employee details
            searchResults.get(0).findElement(By.xpath("//i[@class='oxd-icon bi-pencil-fill']")).click();
            driver.findElement(By.xpath("//div[@class='orangehrm-custom-fields']//button[@type='submit'][normalize-space()='Save']")).click(); // Enable editing
            driver.findElement(By.id("personal_txtEmpNickName")).sendKeys("JD");
            driver.findElement(By.id("btnSave")).click();

            // Verify the nickname is saved
            String nickname = driver.findElement(By.id("personal_txtEmpNickName")).getAttribute("value");
            if (nickname.equals("JD")) {
                System.out.println("Nickname successfully updated!");
            } else {
                System.out.println("Nickname update failed.");
            }

         
            // Close the browser
            driver.quit();
        
    }
}
