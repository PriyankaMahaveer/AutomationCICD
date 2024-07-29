package rahulShettyAcademy.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraLoginPage {

WebDriver driver;
	
	public void landingPage (WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(css="")
	WebElement profile;
	
	



public void goTo ()
{
	driver.get("https://www.myntra.com/");
	
}

}