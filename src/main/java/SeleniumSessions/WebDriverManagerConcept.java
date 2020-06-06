package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		
		driver.get("http://www.amazon.in");
		System.out.println(driver.getTitle());
		
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver = new FirefoxDriver();
		
//		driver.get("https://app.hubspot.com/login");
//		System.out.println(driver.getTitle());

//		WebDriverManager.getInstance(SafariDriver.class).setup();
//		WebDriver driver = new SafariDriver();
		
//		driver.get("https://app.hubspot.com/login");
//		System.out.println(driver.getTitle());
		
	}
}
