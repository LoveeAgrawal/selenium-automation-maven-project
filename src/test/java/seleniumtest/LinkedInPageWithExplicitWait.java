package seleniumtest;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class LinkedInPageWithExplicitWait {

	public static void main(String[] args){
		

			// setting the configuration for chrome driver browser
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\NITIN\\eclipse-workspace\\Training\\resources\\webdrivers\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();// creating object of chromebrowser,launches the browser
			
			driver.get("https://www.linkedin.com/");// navigation to google page
			
			String browserTitle = driver.getTitle();// returns current title of the webpage
			System.out.println("Browser title : " + browserTitle);
			
			//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#email-or-phone")));
		//	driver.findElement(By.cssSelector("#email-or-phone")).sendKeys("agrshaurya@gmail.com");
			
		}

}
