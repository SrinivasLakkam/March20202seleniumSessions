package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleTestPage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/dropdown");
		
		By dropdown = By.id("dropdown");
		ElementUtils elementUtils = new ElementUtils(driver);
		elementUtils.doSelectByVisibleText(dropdown, "Option 1");
	}
}
