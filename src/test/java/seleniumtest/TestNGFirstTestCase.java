package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGFirstTestCase {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass()

	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

			}
	
	@Test
	public static void TestNGTest1() {

		driver.get("https://www.linkedin.com/");// navigation to google page

		String browserTitle = driver.getTitle();// returns current title of the webpage
		Reporter.log("Browser title : " + browserTitle,true);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='session_key']")));
		driver.findElement(By.xpath("//input[@id='session_key']")).sendKeys("agrshaurya@gmail.com");
		driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("xyz123");
	}
	@Test
	public static void TestNGTest2() {

		
		driver.get("https://www.facebook.com/");

		String browserTitle = driver.getTitle();
		Reporter.log("Browser title : " + browserTitle,true);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("agrshaurya@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz123");

}
	@AfterClass
	public static void afterClass()
	{
		Reporter.log("Test class executed successfully",true);
		driver.quit();
		
	}
	}
	
