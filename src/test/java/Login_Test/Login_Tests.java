package Login_Test;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.*;
import Login_POM.Locators_Page;

public class Login_Tests {
	
	WebDriver driver;
	Locators_Page LocObject;
	
	@BeforeTest
	public void setup() {
		driver =new ChromeDriver();
		 LocObject =new Locators_Page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
	@Test(priority=0)
	public void Start() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LocObject.enterUsername("Admin");
		LocObject.enterPassword("admin123");
		LocObject.submitButton();
	}
	
	@Test(priority=1)
	public void validation() {
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed());
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
	
	
	

}
