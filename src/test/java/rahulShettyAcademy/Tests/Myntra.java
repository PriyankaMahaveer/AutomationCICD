package rahulShettyAcademy.Tests;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Myntra {
	public static void main(String[] args) throws InterruptedException

	{
		System.setProperty("webDriver.chrome.driver", "/Users/300074571/Documents/My Doc/JAVAAutomation/chromedriver"); // step to invoke chrome driver manually
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/online-fashion-store");
		//driver.get("https://www.myntra.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input[autocomplete=\"new-password\"]")).sendKeys("8123330077");
		//Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class='submitBottomOption']")).click();
		System.out.println("Hi");
		Thread.sleep(5000);
		//driver.findElement(By.linkText("Password")).click();
		Thread.sleep(5000);
		
		
		
		
		//driver.close();
		
	}

}
