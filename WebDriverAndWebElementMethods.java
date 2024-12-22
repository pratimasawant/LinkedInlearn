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

public class WebDriverAndWebElementMethods {

	WebDriver driver;
	WebElement element;

//	@Test
	public void WebDriverMethods() {
		driver.get("https://nichethyself.com/tourism/home.html");

		driver.getCurrentUrl();
		driver.getTitle();
		String pageSource = driver.getPageSource();

		// navigate
		driver.navigate().to("http://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

		// Cookies
		driver.manage().deleteAllCookies();
		// Try out other cookie related methods as discussed in the class

		// Window position //Point class
		driver.manage().window().getPosition();
		// driver.manage().window().setPosition(null)

		// Window size //Dimension class
		// driver.manage().window().setSize(null)
		driver.manage().window().getSize();
	}

	// @Test
	public void WebElementMethods() {
		driver.get("https://nichethyself.com/tourism/customised.html");
		WebElement swiss = driver.findElement(By.xpath("//label[text()='Switzerland']/input"));
		System.out.println("Is Swiss Checkbox Enabled -  " + swiss.isEnabled());

		driver.get("https://nichethyself.com/tourism/home.html");
		WebElement user = driver.findElement(By.name("username"));
		System.out.println("Is UserName Field Displayed -  " + user.isDisplayed());
		System.out.println("Is UserName Field Enabled -  " + user.isEnabled());
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("Is Submit Button Displayed -  " + submit.isDisplayed());
		System.out.println("Is Submit Button Enabled -  " + submit.isEnabled());
		user.sendKeys("stc123");
		// value attribute gets populated with what you typed. value = "stc123"
		assertEquals(user.getAttribute("value"), "stc123");
		WebElement loginText = driver.findElement(By.xpath("//div[@id = 'loginsection']/h3"));
		assertEquals(loginText.getText(), "Login to your account");
	}

//	@Test
	public void handlingCheckbox() throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/customised.html");
		// Select the England checkbox
		WebElement england = driver.findElement(By.xpath("//label[text()='England']/input"));
		

		if (!england.isSelected()) {
			england.click();
		}
		Thread.sleep(5000);
		
		if (england.isSelected()) {
			england.click();
		}	
		
		Thread.sleep(5000);
		//Text box, radio, checkbox, button, link
		
		//Dropdowns, multi select, Webtable, image
	}

	@Test
	public void handlingWebDropDowns() throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/customised.html");
		driver.findElement(By.xpath("//option[text() = 'Home Stay']")).click();
		Thread.sleep(5000);
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		driver = new ChromeDriver(); // It is inside chromedriver.exe
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@AfterMethod(alwaysRun = true)
	public void closeDriver() {
		driver.manage().deleteAllCookies();
		//driver.quit();
	}

}



