package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {

	public static void main(String[] args) {
		
		//1. get total links count
		//2. print the text of each link(avoid blank texts)
		//3. print the href prop of each link
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
		for(int i=0;i<linksList.size();i++){
			String text = linksList.get(i).getText();
			
			if(!text.isEmpty()){
			System.out.println(i+ "==>" + text.trim());
			System.out.println(linksList.get(i).getAttribute("href"));
			}
			}
	}
}
