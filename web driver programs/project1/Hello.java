package project1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.com");

	}

}
