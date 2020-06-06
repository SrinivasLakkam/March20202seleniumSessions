package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitMethods {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtils utils = new ElementUtils(driver);

		driver.get("https://app.hubspot.com/login");

		String title = utils.waitForTitleToBePresent("Login", 5);
		System.out.println("lognin page title is :" + title);
		
		if(utils.waitForUrl("login", 8)){
			System.out.println("login is present in url");
		}
		
		
		By username = By.id("username");
		By password = By.id("password");
		By logInButton = By.id("loginBtn");
		
		utils.waitForElementPresent(username, 10).sendKeys("naveen@gmail.com");
		utils.doSendKeys(password, "Test@123");
		utils.waitForElementToBeClickable(logInButton, 10).click();;
	}
}
