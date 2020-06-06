package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		System.out.println("page title is :" + title);
		
		//verification point - check point
		if(title.equals("Facebook – log in or sign up")){
			System.out.println("browser name is correct");
		}
		else{
			System.out.println("browser name is incorrect");
		}
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.close();
	}
}
