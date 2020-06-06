package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertFreshersJsPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[3]/button")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("am the new user");
		System.out.println(alert.getText());
		alert.accept();

//		driver.findElement(By.xpath("//*[@id='content']/div/ul/li[2]/button")).click();
//
//		Thread.sleep(5000);
//
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
	}
}
