package testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class testng1 {
@BeforeSuite
void beforesuit() {
	System.out.println("before suit");
}
@BeforeClass
void beforeclass() {
	System.out.println("before class");
}
@BeforeTest
void beforetest() {
	System.out.println("before test");
}
@BeforeMethod
void beforemethod() {
	System.out.println("before method");
}
@Test
void test() {
	System.out.println("Test");
}
@Test
void test1() {
	System.out.println("Test1");
}
@AfterMethod
void Aftermethod() {
	System.out.println("after method");
}
@AfterClass
void Afterclass() {
	System.out.println("after class");
}
@AfterTest
void Aftertest() {
	System.out.println("after test");
}
@AfterSuite

void AfterSuit() {
	System.out.println("after Suit");
}

}
