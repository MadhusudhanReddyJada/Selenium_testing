package p2;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class p3 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
			//String ub="http://localhost:4444/wb/hub";
		WebDriver d;
		String nodeurl="http://localhost:4444/wd/hub";
		String baseurl="https://www.google.com/";
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		//d= new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"),cap);
		d = new RemoteWebDriver(new URL(nodeurl),cap);
		//System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d= new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.close();
//		WebDriver d1;
//		String nodeurl="http://localhost:4444/wd/hub";
//		String baseurl="https://www.google.com/";
//		DesiredCapabilities cap1 = DesiredCapabilities.firefox();
//		cap.setBrowserName("firefox");
//		cap.setPlatform(Platform.WINDOWS);
//		d1 = new RemoteWebDriver(new URL(nodeurl),cap1);
////		System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
//		d1=new FirefoxDriver();
//		d1.get(baseurl);
//		d1.close();
	}

}
