package seleniumtest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotTest {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		driver.get("https://www.google.com/");// navigation to google page
		captureScreenShots("GooglePage");

		String browserTitle = driver.getTitle();// returns current title of the webpage
		System.out.println("Browser title : " + browserTitle);
		driver.findElement(By.name("q")).sendKeys("selenium.dev");
		File elementSnapShot=driver.findElement(By.name("q")).getScreenshotAs(OutputType.FILE);
		File targetFile= new File("C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\screenshots\\elementScreenShot.png");
				FileUtils.copyFile(elementSnapShot, targetFile);
				driver.findElement(By.name("q")).submit();
		captureScreenShots("GoogleSearchPage");

	}

	private static void captureScreenShots(String pageName) throws IOException {
		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\screenshots\\" + pageName + ".png");
		FileUtils.copyFile(sourceFile, targetFile);
	}
}