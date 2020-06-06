package testngSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void logInTest(){
		System.out.println("logInTest....");
	}
	
	@Test(dependsOnMethods = "logInTest", priority=2)
	public void homePageTest(){
		System.out.println("homePageTest....");
	}
	
	@Test(dependsOnMethods = "logInTest", priority=1)
	public void searchPageTest(){
		System.out.println("logInTest....");
	}

}
