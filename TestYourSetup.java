package scripts;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestYourSetup {

	WebDriver driver;
	WebElement element;

	@Test
	public void loginToNicheThyselfTourism() {
		driver.get("https://nichethyself.com/tourism/home.html");
		String expectedPageTitle = "My account";
		 element = driver.findElement(By.name("username"));
	     element.sendKeys("stc123");
		
		 //driver.findElement(By.name("username")).sendKeys("stc123");
		 driver.findElement(By.name("password")).sendKeys("12345");
		 element.submit();
		 
		 String actualPageTitle = driver.getTitle();
		 assertEquals(actualPageTitle, expectedPageTitle);
		 String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
		// driver.findElement(By.xpath("/a[@aria-label = \'Gmail\']"));
		 
		 //driver.findElement().findElement();
		 
		 WebElement element =driver.findElement(By.xpath("//input"));
		 List<WebElement> allElement = driver.findElements(By.xpath("//input"));
		 
		
	}

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		driver = new ChromeDriver(); //It is inside chromeDriver.exes
		driver.manage().window().maximize();
		 // driver = new FirefoxDriver();
		//  driver = new SafariDriver();
		//  driver = new EdgeDriver();
		
		
	}
	
		@AfterMethod(alwaysRun = true)
	public void closeDriver() {
		driver.quit();
		
	}

}
