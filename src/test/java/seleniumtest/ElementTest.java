package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		Thread.sleep(2000);
		driver.get("https://demoqa.com/text-box");// navigation to linkedin page
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Shaurya");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("agrshaurya@gmail.com");
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys("Mill Grove");
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys("Mill Grove Drive");
		driver.findElement(By.cssSelector("#submit")).click();
		String actualName = driver.findElement(By.xpath("//p[@id='name']")).getText();
		System.out.println("Actual name : " + actualName);
		if (actualName.equals("Name:Shaurya")) {
			System.out.println("Name verified");

		} else {
			System.out.println("Name not verified");

		}
		String actualEmail = driver.findElement(By.xpath("//p[@id='email']")).getText();
		System.out.println("Actual email : " + actualEmail);
		if (actualEmail.equals("Email:agrShaurya@gmail.com")) {
			System.out.println("Email verified");

		} else {
			System.out.println("Email not verified");

		}
		String actualCurrentAddress = driver.findElement(By.xpath("//p[@id='currentAddress']")).getText();
		System.out.println("Actual current address : " + actualCurrentAddress);
		if (actualCurrentAddress.equals("Current Address :Mill Grove")) {
			System.out.println("Current address verified");

		} else {
			System.out.println("Current address not verified");

		}

		String actualPermanentAddress = driver.findElement(By.xpath("//p[@id='permanentAddress']")).getText();
		System.out.println("Actual Permanent address : " + actualPermanentAddress);
		if (actualPermanentAddress.equals("Permananet Address :Mill Grove Drive")) {
			System.out.println("Permanent address verified");

		} else {
			System.out.println("Permanent address not verified");

		}

	}
}
