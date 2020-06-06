package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class LogInPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true") ;
		BrowserUtils br = new BrowserUtils();
		WebDriver driver = br.init_driver("chrome");
		br.launchUrl("https://app.hubspot.com/login");
		Thread.sleep(5000);
		
//		br.navigateToUrl("https://app.hubspot.com/login");
//		br.navigateBackward();
	
		br.navigateAndRefresh();
//		br.doGetTitle();
		
		By emailId = By.id("username");
		By pwd = By.id("password");
		By logInButton = By.id("loginBtn");
		
		ElementUtils elementUtils = new ElementUtils(driver);
		elementUtils.doSendKeys(emailId, "naveenanimation30@gmail.com");
		elementUtils.doSendKeys(pwd, "Test@1234");
		
//		driver.findElement(logInButton).isDisplayed();
		if(elementUtils.doIsDisplayed(logInButton)){
			elementUtils.doClick(logInButton);
		}
		
//	    br.doQuitBrowser();
	}
}
