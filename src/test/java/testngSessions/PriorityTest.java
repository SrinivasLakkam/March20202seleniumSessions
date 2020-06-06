package testngSessions;

import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority=1)
	public void test1(){
		System.out.println("test 1...");
	}
	
	@Test
	public void test2(){
		System.out.println("test 2...");
	}
	
	@Test
	public void test3(){
		System.out.println("test 3...");
	}
	
	@Test(priority=2)
	public void test4(){
		System.out.println("test 4...");
	}
	
	@Test
	public void test5(){
		System.out.println("test 5...");
	}
	
}
