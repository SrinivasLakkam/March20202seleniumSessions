package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateAndGet {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://www.rediff.com");
		
		driver.navigate().back();
		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().forward();
	}
}
