package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		
		String browser ="chrome";
		
		WebDriver driver = null;
		
		if(browser.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")){
			driver = new SafariDriver();
		}
		
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
}
