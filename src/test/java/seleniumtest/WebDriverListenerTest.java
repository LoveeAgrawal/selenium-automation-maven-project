package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class WebDriverListenerTest {

	public static void main(String[] args) throws InterruptedException {
		TestListeners listener = new TestListeners();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver1 = new ChromeDriver();// creating object of chromebrowser,launches the browser
		Thread.sleep(2000);
		WebDriver driver = new EventFiringDecorator(listener).decorate(driver1);
		driver.get("https://demoqa.com/text-box");// navigation to linkedin page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Shaurya");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("agrshaurya@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Mill Grove");
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Mill Grove Drive");
		driver.findElement(By.cssSelector("#submit")).click();

	}

}
