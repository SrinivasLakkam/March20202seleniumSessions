package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitVisibiltyOfElements {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		ElementUtils elementUtils = new ElementUtils(driver);
		
		driver.get("https://www.freshers.com/");
		
		By footerLinksList = By.cssSelector("ul.footer-nav li");
		List<WebElement> footerList = elementUtils.visibiltyOfAllElements(footerLinksList, 5);
		System.out.println(footerList.size());
		
		for(int i=0; i<footerList.size(); i++){
			System.out.println(footerList.get(i).getText());
		}
		
				
	}
}
