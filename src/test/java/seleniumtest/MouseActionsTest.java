package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseActionsTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		driver.get("https://demoqa.com/tool-tips");// navigation to google page
		
		String browserTitle = driver.getTitle();// returns current title of the webpage
		System.out.println("Browser title : " + browserTitle);
		Actions action=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("//a[normalize-space()='Contrary']"));
		action.moveToElement(target).build().perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[aria-describedby='contraryTexToolTip']")));
		driver.findElement(By.xpath("//a[aria-describedby='contraryTexToolTip']")).isDisplayed();
		
		action.contextClick(target).build().perform();


	}

}
