package testngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test(expectedExceptions = ArithmeticException.class)
	public void divTest(){
		int a =9/0;
		System.out.println(a);
	}
}
