package gridexample;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid1 {
	
	static WebDriver d;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		String nodeurl="http://localhost:4444/grid/console";
		String baseurl="https://www.google.com";
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setBrowserName("Firefox");
		cap.setPlatform(Platform.WINDOWS);
		d= new RemoteWebDriver(new URL(nodeurl),cap);
		//System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d= new FirefoxDriver();
		d.get(baseurl);
		d.manage().window().maximize();
		Thread.sleep(3000);
		d.close();

	}

}
