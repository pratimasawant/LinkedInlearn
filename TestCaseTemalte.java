package scripts;

import static org.testng.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class TestCaseTemalte {
	
	

	WebDriver driver;
	WebElement element;

/*	@Test
	public void loginToNicheThyselfTourism() throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/home.html");
		driver.findElement(By.xpath("//a[@href='customised.html']")).click();
		//driver.switchTo().window("Customized tours");
		
		//driver.findElement(By.xpath("//option[text()='Home Stay']")).click();
		
		driver.findElement(By.xpath("//button[text()='Contact us!']")).click();
		//driver.switchTo().window("Contact us");
		
		driver.findElement(By.className("glyphicon-search")).click();
		Thread.sleep(5000);
		Alert myAlert;
		
		try {
		myAlert = driver.switchTo().alert();
		myAlert.sendKeys("London");
		Thread.sleep(5000);
		myAlert.accept();
		driver.close();
		}catch (NoAlertPresentException e)
		{
			fail("Alert was resent but not found");
		
		}
		//driver.findElement(By.xpath("//div[@class='card-header']")).click();
		
		
		
		List<String> expectedOptions = new ArrayList<String>();
		expectedOptions.add("Home Stay");
		
		Thread.sleep(5000);
		WebElement england = driver.findElement(By.xpath("//label[text()='England']/input"));
		
		if (!england.isSelected()) {
			england.click();
		}
		Thread.sleep(5000);
		
		if (england.isSelected()) {
			england.click();
		}	
		
		Thread.sleep(5000);
	}*/
	
	@Test
	public void handlingWindowPopups() throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/home.html");
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='Contact us!']")).click();
		try {
			driver.switchTo().window("Contact");// Window Name
		} catch (NoSuchWindowException e) {
			fail("Contact Us Window was not present !!");
		}

		driver.findElement(By.className("glyphicon-search")).click();
		Thread.sleep(3000);
		Alert myAlert;

		try {
			myAlert = driver.switchTo().alert();
			myAlert.sendKeys("London");
			Thread.sleep(6000);
			myAlert.accept();
			driver.close();
		} catch (NoAlertPresentException e) {
			fail("Alert was expected but not found!");
		}	
		
		driver.switchTo().window(parentWindowHandle);//Window handle
		
	}
	
	
	

	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() {
		driver = new ChromeDriver(); //It is inside chromeDriver.exes
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	
		@AfterMethod(alwaysRun = true)
	public void closeDriver() {
		//driver.quit();
		
	}
	
	
	

}
