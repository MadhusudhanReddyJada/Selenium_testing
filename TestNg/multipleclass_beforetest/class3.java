package multipleclass_beforetest;

import org.testng.annotations.Test;

public class class3 extends class2 {
	@Test(priority=6)
	  public void login() {
		  System.out.println("logged in  success");
	  }
  @Test(priority=7)
  public void close() {
	  d.close();
  }
  
}
