package internaldata;

import org.openqa.selenium.chrome.ChromeDriver;

public class calling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		pom2 c=new pom2(d);
		c.fname();
		c.lname();
		c.phone();
		c.email();
		c.country();
		c.submit();

	}

}
