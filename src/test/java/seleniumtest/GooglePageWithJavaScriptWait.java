package seleniumtest;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageWithJavaScriptWait {

	public static void main(String[] args) {

		// setting the configuration for chrome driver browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		driver.get("https://www.google.com/");// navigation to google page

		String browserTitle = driver.getTitle();// returns current title of the webpage
		System.out.println("Browser title : " + browserTitle);
		driver.findElement(By.name("q")).sendKeys("selenium.dev");
		driver.findElement(By.name("q")).submit();
		for (int i = 1; i < 10; i++) {

			boolean hasPageLoaded = ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
					.equalsIgnoreCase("complete");
			if (hasPageLoaded) {
				break;
			}
		}
		System.out.println("Page loaded completely");

	}
}