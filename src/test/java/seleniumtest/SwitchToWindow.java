package seleniumtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		Thread.sleep(2000);// milli-seconds, 2 Seconds

		driver.get("https://www.facebook.com/");// navigation

		Thread.sleep(2000);

		driver.findElement(By.linkText("Meta Pay")).click();

		Thread.sleep(2000);

		driver.findElement(By.linkText("Meta Pay")).click();

		Thread.sleep(2000);

		String defaultWindowId = driver.getWindowHandle();// OS provides a unique window id

		// set collection stores only unique values/element
		Set<String> windowIds = driver.getWindowHandles();// returns all window id's launched by selenium

		for (String windowId : windowIds) {
			System.out.println(windowId);
		}



	}

}
