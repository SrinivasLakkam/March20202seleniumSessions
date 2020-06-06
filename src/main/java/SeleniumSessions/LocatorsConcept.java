package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		
		// Create the WebElement --> perform actions(click, sendkeys, get the text)
		//locators --> diff types of locators avilable in Selenium By Class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://app.hubspot.com/login");

		//driver.get("http://classic.crmpro.com");
		
		driver.get("https://www.freshers.com/");
		
		Thread.sleep(5000);
		
		//Case 1:
		//1. id:
//		driver.findElement(By.id("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("test123");
//		driver.findElement(By.id("loginBtn")).click();

		//Case 2:
//		WebElement emailId = driver.findElement(By.id("username"));
//		WebElement pwd = driver.findElement(By.id("password"));
//		WebElement logInButton = driver.findElement(By.id("loginBtn"));
//		
//		emailId.sendKeys("test@gmail.com");
//		pwd.sendKeys("test123");
//		logInButton.click();
		
		//Case 3:By locators
//		By emailId = By.id("username");
//		By pwd = By.id("password");
//		By logInButton = By.id("loginBtn");
//
		//Web elements
//		WebElement email1 = driver.findElement(emailId);
//		WebElement pwd1 = driver.findElement(pwd);
//		WebElement logIn1 = driver.findElement(logInButton);
//		
//		email1.sendKeys("test@gmail.com");
//		pwd1.sendKeys("test123");
//		logIn1.click();

		//Case 4:
		
//		String email = "username";
//		String pwd = "password";
//		String login = "loginBtn";
//		
//		By email1 = By.id(email);
//		By pwd1 = By.id(pwd);
//		By login1 = By.id(login);
//		
//		driver.findElement(email1).sendKeys("test@gmail.com");
//		driver.findElement(pwd1).sendKeys("test123");
//		driver.findElement(login1).click();
		
		//2. Class:
//		driver.findElement(By.name("username")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test123");
		
		//3. ClassName:
//		driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password")).sendKeys("test123");
//		driver.findElement(By.className("login-submit")).click();
		
		//4. XPath:
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("test@gmail.com");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test123");
//		driver.findElement(By.xpath("//*[@id='loginBtn']")).click();
		
		//5. CSS Locator
//		driver.findElement(By.cssSelector("#username")).sendKeys("test@gmail.com");
//		driver.findElement(By.cssSelector("#password")).sendKeys("test123");
//		driver.findElement(By.cssSelector("#loginBtn")).click();
		
		//6. LinkText: Only for links
//		driver.findElement(By.linkText("Sign up")).click();
		
		//7. Partial LinkText
//		driver.findElement(By.partialLinkText("Sign")).click();
		
		//8. TagName
		String header = driver.findElement(By.tagName("h1")).getText();
		System.out.println(header);
	}	
}
