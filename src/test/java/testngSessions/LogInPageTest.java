package testngSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInPageTest extends BaseTest{

	@Test(priority=2)
	public void verifyLogInPageTitletest(){
		String title = driver.getTitle();
		System.out.println("login page title is: " + title);
		Assert.assertEquals(title, "HubSpot Login");
	}
	
	@Test(priority=1)
	public void verifySignUpLinkTest(){
		Assert.assertTrue(driver.findElement(By.linkText("SignUp")).isDisplayed());
	}
	
	@Parameters({"username", "password"})
	@Test(priority=3)
	public void logInTest(String username, String password){
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("loginBtn")).click();

	}

}
