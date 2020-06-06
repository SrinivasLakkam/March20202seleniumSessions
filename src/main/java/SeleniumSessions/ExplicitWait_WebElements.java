package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_WebElements {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		
		By username = By.id("username");
		By password = By.id("password");
		By logInButton = By.id("loginBtn");

		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
//		
////		WebDriverWait wait = new WebDriverWait(driver, 10);
////		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
//
////		waiting for presence of element located by: By.id: username(tried for 3 second(s) with 500 milliseconds interval)
//
//		driver.findElement(By.id("username")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test@123");
//		
////		If the loginbutton is visible after 5 seconds at that time we want to apply implicitWait
//		
//		wait = new WebDriverWait(driver, 5);
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("loginBtn")));
//		driver.findElement(By.id("loginBtn")).click();
		
		waitForElementPresent(driver, 10, username).sendKeys("naveen@gmail.com");
		driver.findElement(By.id("password")).sendKeys("test@123");
		waitForElementPresent(driver, 5, logInButton).click();

	}
	
	public static WebElement waitForElementPresent(WebDriver driver, int timeout, By locator){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return element;
	}
}
