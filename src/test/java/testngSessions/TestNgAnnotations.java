package testngSessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	//Before
	//Test
	//After
	
	/*
	 * connect With DB--BS
	   create User--BT
	   launch Browser--BC
	    
	      log In To App--Bm
	   		verify Logged In User--T1
       	  logOut--AM
       
          log In To App--BM
            verify Title Test--T2
          logOut--AM
       
       close Browser--AC
             delete User--AT
       disconnect DB--AS
	 */
	@BeforeSuite
	public void connectWithDB(){
		System.out.println("connect With DB");
	}
	
	@BeforeTest
	public void createUser(){
		System.out.println("create User");
	}
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("launch Browser");
	}
	
	@BeforeMethod
	public void logInToApp(){
		System.out.println("log In To App");
	}
	
	@Test
	public void verifyTitleTest(){
		System.out.println("verify Title Test");
	}
	
	@Test
	public void verifyLoggedInUser(){
		System.out.println("verify Logged In User");
	}
	
	@AfterMethod
	public void logOut(){
		System.out.println("logOut");
	}
	
	@AfterClass
	public void closeBrowser(){
		System.out.println("close Browser");
	}
	
	@AfterTest
	public void deleteUser(){
		System.out.println("delete User");
	}
	
	@AfterSuite
	public void disconnectDB(){
		System.out.println("disconnect DB");
	}
}
