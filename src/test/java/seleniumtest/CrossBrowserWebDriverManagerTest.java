package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserWebDriverManagerTest {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",
			//	"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver;// creating object of chromebrowser,launches the browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demoqa.com/text-box");// navigation to linkedin page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Shaurya");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("agrshaurya@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Mill Grove");
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Mill Grove Drive");
		driver.findElement(By.cssSelector("#submit")).click();


	}

}
