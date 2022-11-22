package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ScrollTestWithDataProvider {
	@Test(dataProvider = "create")
	public void scrollTest(String name,String eMail,String cAddress,String pAddress) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
		Thread.sleep(2000);
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(eMail);
		driver.findElement(By.cssSelector("#currentAddress")).sendKeys(cAddress);
		driver.findElement(By.cssSelector("#permanentAddress")).sendKeys(pAddress);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		WebElement interactionElement = driver.findElement(By.xpath("//div/p[@id='name']"));
		JavascriptExecutor javascriptExecutor = ((JavascriptExecutor) driver);
		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", interactionElement);
		System.out.println("Element scrolling done successfully ");

	}

	@DataProvider(name = "create")
	public Object[][] createData() {
		return  new Object[][]{{"Rama","rama@gmail.com","Mill Grove","Mill Grove Drive"},{"Krishna","krishna@gmail.com","Audubon","Audubon Village"}};

	}

}
