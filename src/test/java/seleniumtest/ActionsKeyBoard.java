package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsKeyBoard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/text-box");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Shaurya");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("agrshaurya@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Mill Grove");
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL);
	action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		


	}

}
