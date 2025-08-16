package Login_Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Login_POM.Locators_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Tests {
	
	WebDriver driver;
	Locators_Page LocObject;
	
	@BeforeTest
	public void setup() {
	   
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		 LocObject =new Locators_Page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
	@Test(priority=0)
	public void Start() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		LocObject.enterUsername("Admin");
		LocObject.enterPassword("admin123");
		LocObject.submitButton();
	}
	
	@Test(priority=1)
	public void validation() {
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed());
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}

}
