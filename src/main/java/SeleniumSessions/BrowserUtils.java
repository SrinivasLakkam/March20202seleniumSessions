package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	
	WebDriver driver;
	
	public WebDriver init_driver(String browserName){
		
		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "safari":
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
			break;

		default:
			System.out.println(browserName+": browser not found");
			break;
		}
		return driver;
		
	}
	
	public void launchUrl(String url){
		driver.get(url);
	}
	
	public void navigateToUrl(String url){
		driver.navigate().to(url);
	}
	
	public void navigateBackward(){
		driver.navigate().back();
	}
	
	public void navigateAndRefresh(){
		driver.navigate().refresh();
	}
	
//	public String doGetTitle(){
//		return driver.getTitle();
//	}
	
	public void doQuitBrowser(){
		driver.quit();
	}
}

