package Login_Test;
import java.time.Duration;

<<<<<<< HEAD
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
=======
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;
import org.testng.annotations.*;
import Login_POM.Locators_Page;
>>>>>>> d28274386b634e7a3cfceea286775fd22a903e36

public class Login_Tests {
	
	WebDriver driver;
	Locators_Page LocObject;
	
	@BeforeTest
	public void setup() {
<<<<<<< HEAD
	   
		WebDriverManager.chromedriver().setup();
=======
>>>>>>> d28274386b634e7a3cfceea286775fd22a903e36
		driver =new ChromeDriver();
		 LocObject =new Locators_Page(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
	
	@Test(priority=0)
	public void Start() {
<<<<<<< HEAD
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

=======
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
>>>>>>> d28274386b634e7a3cfceea286775fd22a903e36
		LocObject.enterUsername("Admin");
		LocObject.enterPassword("admin123");
		LocObject.submitButton();
	}
	
	@Test(priority=1)
	public void validation() {
<<<<<<< HEAD
		AssertJUnit.assertTrue(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed());
=======
		Assert.assertTrue(driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed());
>>>>>>> d28274386b634e7a3cfceea286775fd22a903e36
	}
	
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
<<<<<<< HEAD
=======
	
	
	
>>>>>>> d28274386b634e7a3cfceea286775fd22a903e36

}
