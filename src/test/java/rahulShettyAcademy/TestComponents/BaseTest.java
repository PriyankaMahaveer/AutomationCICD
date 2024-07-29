package rahulShettyAcademy.TestComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	
	public void initializeDriver() throws IOException
	{
		
	
		
		// locate properties class
		FileInputStream fis =new FileInputStream("/Users/300074571/Documents/My Doc/Framework/SeleniumFrameworkDesign/src/main/resources/GlobalData.properties");
		
		
		//load properties class
		Properties pro= new Properties();
		pro.load(fis);
		//read properties file
		String browserName= pro.getProperty(null);
		
		if (browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webDriver.chrome.driver", "/Users/300074571/Documents/My Doc/JAVAAutomation/chromedriver"); // step to invoke chrome driver manually
			WebDriver driver= new ChromeDriver();	
		//WebDriverManager.chromedriver().setup();
		}
		
		else if (browserName.equalsIgnoreCase("Safari"))
			
		{
			SafariDriver driver = new SafariDriver();
			
		}
		
		else if (browserName.equalsIgnoreCase("firefox"))
			
		{
		//firefox
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.manage().window().maximize();
	}
	
	
}
