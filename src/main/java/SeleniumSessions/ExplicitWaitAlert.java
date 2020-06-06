package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitAlert {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtils elementUtils = new ElementUtils(driver);
		
		
		By clickForJsAlert = By.xpath("//button[text()='Click for JS Alert']");
				
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
//		elementUtils.waitForElementToBeClickable(clickForJsAlert, 5).click();
//		elementUtils.waitForAlertToBePresent(5).accept();
		
		elementUtils.clickWhenReady(clickForJsAlert, 5);
		Alert alert = elementUtils.waitForAlertToBePresent(5);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
	}
}
