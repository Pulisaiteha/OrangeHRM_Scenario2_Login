package Login_POM;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Locators_Page {
	
	WebDriver driver;
	
	public Locators_Page(WebDriver driver){
		
		this.driver=driver;
	}
	
	private By username =By.name("username");
	private By password =By.name("password");
	private By submit   =By.xpath("//button[text()=' Login ']");
	
	public void enterUsername(String userName) {
		driver.findElement(username).sendKeys(userName);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void submitButton() {
		driver.findElement(submit).click();
	}

}
