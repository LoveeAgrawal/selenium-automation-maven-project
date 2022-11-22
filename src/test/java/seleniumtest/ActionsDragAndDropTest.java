package seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ActionsDragAndDropTest {
@Test
	public void actionDragAndDrop() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		driver.get("https://demoqa.com/droppable");// navigation to google page
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String browserTitle = driver.getTitle();// returns current title of the webpage
		Reporter.log("Browser title : " + browserTitle,true);
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions action = new Actions(driver);
		WebElement interactionElement=driver.findElement(By.xpath("//div[@id='draggable']"));
		JavascriptExecutor javascriptExecutor=((JavascriptExecutor)driver);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", interactionElement);
		
		action.dragAndDrop(draggable, droppable).build().perform();

	}

}
