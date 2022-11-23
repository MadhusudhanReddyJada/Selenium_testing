package Module1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New1 {
	@BeforeMethod
  public void f() {
		System.out.println("hello world");
  }
	@Test
	 public void f1() {
			System.out.println("hello world    jhefkjbkjwfvhjfdd dhqfhj");
	  }
	@AfterMethod
	 public void f2() {
			System.out.println("hello world    jhefkjbkj");
	  }
}
