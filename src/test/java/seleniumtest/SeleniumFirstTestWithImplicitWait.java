package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstTestWithImplicitWait {

	public static void main(String[] args) {

		// setting the configuration for chrome driver browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");// navigation to google page
		
		String browserTitle = driver.getTitle();// returns current title of the webpage
		System.out.println("Browser title : " + browserTitle);
	}

}
