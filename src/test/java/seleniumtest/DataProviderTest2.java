package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTest2 {
	WebDriver driver ;
	@Test(dataProvider = "create")
	public void test(String key) throws InterruptedException {
		
		driver.get(key);
		Reporter.log("Page opened successfully  "+driver.getTitle(),true);
		
		
	}

@DataProvider(name="create")
public Object[][] createData()
{
return  new Object[][]{{"https://www.google.com/"},{"https://www.facebook.com/"},{"https://www.linkedin.com/"}};


	


}
@BeforeClass
public void beforeClass() throws InterruptedException
{
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	Thread.sleep(2000);
	
}

@AfterClass
public void afterClass()
{
	driver.quit();
}

}

