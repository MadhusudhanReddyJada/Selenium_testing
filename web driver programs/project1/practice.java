package project1;

import java.util.Scanner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class practice {
	public static ChromeDriver chrome() {
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d= new ChromeDriver();
		return d;
	}
	public static FirefoxDriver firefox() {
		return new FirefoxDriver();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver d;
		FirefoxDriver f;
		Scanner s= new Scanner(System.in);
		String s1=s.nextLine();
		switch(s1)
		{
		case "Chrome":
		{
			d= chrome();
			d.get("https://www.youtube.com");
			break;
		}
		case "Firefox":
		{
			f=firefox();
			f.get("https://www.youtube.com");
			break;
		}
		default :
			System.out.println("invalid");
			break;

	}

}
}