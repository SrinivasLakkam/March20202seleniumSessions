package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/course/frames/index.html");
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
		
//		driver.switchTo().frame("main");
//		driver.switchTo().frame(2);
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
	}
}
