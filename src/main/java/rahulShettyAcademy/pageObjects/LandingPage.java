package rahulShettyAcademy.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//POM for landing page this contains all locators used for landing on page
public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver driver) //constructor
	
	{
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement userEmail= driver.findElement(By.id("userEmail"));
	
	
	
	// below are the locators
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement submit;
	

	public void loginApplication(String email,String pwd)
	{
		userEmail.sendKeys(email);
		userPassword.sendKeys(pwd);
		submit.click();
		
		
	}
	
}

