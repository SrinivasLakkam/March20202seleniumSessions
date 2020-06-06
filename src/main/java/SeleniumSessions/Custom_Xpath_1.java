package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Custom_Xpath_1 {

	public static void main(String[] args) throws InterruptedException {
		
		//XPATH == > XML PATH IN DOM HTML
				//address of the element in DOM
				//1. absolute xpath
				//2. relative xpath -- custom xpath
				
				//html/body/div/div[2]/div[4]/div/ul/li/span -- text
				//xpath with id
				
				//htmltag[@prop='value']
				//input[@id='username'] -- 20 elements < 5 secs
				//*[@id='username'] -- 5 secs for 100 elements
				
				//input[@type='email']
				
				//htmltag[@prop1='value' and @prop2='value']
				//input[@id='username' and @type='email']
				//input[@id='username' and @type]
				
				//input[@id and @type]
				//input[@id]
				
				//input[@id='password' and @type='password']
				//input[@id='password']
				
				//with index:
				// (//input[@id])[1]
				
				//input[@name='username']
				//input[@placeholder='Username']
				//input[@placeholder='Username' and @type='text' and @class='form-control' and @name='username']
				// (//input[@class='form-control'])[1]
				
				// (//input[@class='form-control'])[position()=1]
				
				//div//input[@id='username'] --  direct _ indirect child elements
				//div/input[@id='username'] -- only direct child elements
				
				//div//input -- 3
				//div/input -- 2
				
				// (//ul[@class='footer-nav'])[2]/li
				
				//ul[@class='l-nav-list nav-main-menu']/li/span[@class='nav-label']
				//ul[@class='l-nav-list nav-main-menu']/li/a
				
				//i18n-string[@data-key='login.signupLink.cta']
				
				
				//text() in xpath: for links, span, label, heading
				//htmltag[text()='value']
				//i18n-string[text()='Sign up']
				
				//a//i18n-string[text()='Sign up']
				//a[text()='Pricing']
				//h3[text()='Companies & Contacts']
				
				//starts-with() in xpath
				//input[starts-with(@id,'user')]
				//input[starts-with(@id,'username')]
				
				//input <id="test_123"/>
				//input <id="test_124"/>
				//input <id="test_1255"/>
				//input[starts-with(@id,'test_')]

				//contains:
				//input[contains(@id,'name')]
				
				//a[contains(text(),'Pricing')]
				//input[@id='username' and contains(@type,'email')]
				//input[contains(@id,'username') and contains(@type,'email')]

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.freshworks.com/");
        driver.get("http://classic.crmpro.com");
		driver.manage().window().maximize();

//		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='footer-nav']/li"));
//		// or (//ul[@class='footer-nav'])[2]/li
//		for(int i=0; i<list.size();i++){
//			String text = list.get(i).getText();
//			System.out.println(text);
//		}

//		System.out.println(driver.findElement(By.xpath("//div[@class='col-sm-6']/p")).getText());
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='collapse navbar-collapse']"
				+ "/ul[@class='nav navbar-nav navbar-right']/li/a"));
		for(int i=0;i<list.size();i++){
			String text = list.get(i).getText();
			System.out.println(text);
		}
		
	}
}
