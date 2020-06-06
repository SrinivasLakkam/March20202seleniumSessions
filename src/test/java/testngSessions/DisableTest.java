package testngSessions;

import org.testng.annotations.Test;

public class DisableTest {

	@Test
	public void test1(){
		System.out.println("test 1...");
	}
	
	@Test(enabled=false)
	public void test2(){
		System.out.println("test 2...");
	}
	
	@Test(enabled=false)
	public void test3(){
		System.out.println("test 3...");
	}
	
	@Test
	public void test4(){
		System.out.println("test 4...");
	}
	
	@Test
	public void test5(){
		System.out.println("test 5...");
	}
}
