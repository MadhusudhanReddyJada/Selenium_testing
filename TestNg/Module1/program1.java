package Module1;

import org.testng.annotations.Test;

public class program1 {
  @Test(priority=1)
  public void openingbrowser() {
	  System.out.println("open success");
  }
  @Test(priority=5)
  public void custmordetails() {
	  System.out.println("cust details update success");
  }
  @Test(priority=3)
  public void payment() {
	  System.out.println("paymaent success");
  }
  @Test(priority=6)
  public void feedback() {
	  System.out.println("Feedback is taken");
  }

  @Test(priority=2)
  public void duplicate() {
	  System.out.println("This is dummy method  !!!!!!!!!");
  }
  @Test(priority=4)
  public void close() {
	  System.out.println("closed  success");
  }



}
