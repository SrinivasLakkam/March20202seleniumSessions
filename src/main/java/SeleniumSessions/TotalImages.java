package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> listImages = driver.findElements(By.tagName("img"));
		System.out.println(listImages.size());
		for(int i=0;i<listImages.size();i++){
			System.out.println(i + "==>" +listImages.get(i).getAttribute("src"));
		}
	}
}
