package project1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
//Object ub=new String("http://localhost:4444/wb/hub");
//String s=(String)ub;
		
		WebDriver d;
		//String ub="http://localhost:4444/wb/hub";
		String s="http://localhost:4444/wb/hub";
		DesiredCapabilities cap1=DesiredCapabilities.firefox();
		cap1.setBrowserName("firefox");
		cap1.setPlatform(Platform.WINDOWS);
		//System.out.println((String)ub);
		////RemoteWebDriver remote = new RemoteWebDriver(URL(s),DesiredCapabilities.chrome());
		//r(S)emote.navigate().GoToUrl(s);
		//URL(s)
		d = new RemoteWebDriver(new URL(s),cap1);
		//System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d= new FirefoxDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.close();
	}

}
