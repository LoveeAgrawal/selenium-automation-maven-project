package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class MainTest {

	public static void main(String[] args) {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe"
		 * );
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		driver.get("https://demoqa.com/droppable");// navigation to google page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String browserTitle = driver.getTitle();// returns current title of the webpage
		System.out.println("Browser title : " + browserTitle);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(draggable, droppable).build().perform();

	}

}
