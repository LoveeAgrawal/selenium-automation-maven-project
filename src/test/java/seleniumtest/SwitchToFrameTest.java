package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToFrameTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/edge/package-summary.html");
		driver.switchTo().frame("packageListFrame");
		List<WebElement> packageList = driver.findElements(By.tagName("a"));

		for (WebElement element : packageList) {
			System.out.println("link text(): " + element.getText());
		}
		driver.switchTo().defaultContent();
		
		

	}

}
