package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		Thread.sleep(2000);
		driver.get("https://www.linkedin.com/");// navigation to linkedin page
		Thread.sleep(2000);
		System.out.println("Linkedin page opened successfully ");
		String browserTitle = driver.getTitle();// returns current title of the webpage
		System.out.println("Browser title : " + browserTitle);
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		driver.findElement(By.name("session_key")).sendKeys("agrlovee@gmail.com");
		System.out.println("Username entered successfully");
		driver.findElement(By.name("session_password")).sendKeys("Password@123");
		System.out.println("Password entered successfully");
		driver.findElement(By.partialLinkText("Sign in")).click();
		int totalButtons=driver.findElements(By.tagName("button")).size();
		System.out.println("Total button : "+totalButtons);



}
}