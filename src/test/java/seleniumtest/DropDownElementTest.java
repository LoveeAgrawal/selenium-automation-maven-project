package seleniumtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownElementTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/select-menu");
		Select selectColor=new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
selectColor.selectByIndex(0);
Thread.sleep(1000);
selectColor.selectByValue("red");
Thread.sleep(1000);
selectColor.selectByVisibleText("Red");
Thread.sleep(1000);

Select selectCars=new Select(driver.findElement(By.xpath("//select [@id='cars']")));
selectCars.deselectByVisibleText("Audi");

List<WebElement> carOptions = selectCars.getOptions();
System.out.println("Total car options are :"+carOptions.size());
for(WebElement carOption : carOptions)
{

	System.out.println("Car Option are: "+carOption.getText());
}
	}

}
