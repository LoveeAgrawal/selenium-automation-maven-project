package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrameTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/edge/package-summary.html");
		Thread.sleep(2000);
		
		driver.navigate().forward();

	}

}
