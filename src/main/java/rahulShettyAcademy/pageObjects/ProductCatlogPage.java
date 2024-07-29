package rahulShettyAcademy.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//POM for landing page this contains all locators used for landing on page
public class ProductCatlogPage {

	WebDriver driver;
	
	public ProductCatlogPage(WebDriver driver) //constructor
	
	{
		super();
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//WebElement userEmail= driver.findElement(By.id("userEmail"));
	
	
	
	// below are the locators
	
	//List<WebElement> products = driver.findElements(By.xpath("//div[contains(@class, 'mb-3')]"));
	
	@FindBy(xpath="//div[contains(@class, 'mb-3')")
	List <WebElement> products;
	
	
	public List<WebElement> getProductList()
	{
		List<WebElement> products = driver.findElements(By.xpath("//div[contains(@class, 'mb-3')]"));
		return products;
	}
	
}
