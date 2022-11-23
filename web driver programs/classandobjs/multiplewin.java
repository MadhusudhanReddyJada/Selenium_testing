package classandobjs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiplewin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demoqa.com/browser-windows");
		d.manage().window().maximize();
		String pid=d.getWindowHandle();
		System.out.println(pid);
		d.findElement(By.id("windowButton")).click();
		Set<String> cid = d.getWindowHandles();
		System.out.println(cid);
		for(String handle:cid) {
			if(!handle.equalsIgnoreCase(pid)) {
				d.switchTo().window(handle);
				System.out.println(d.findElement(By.id("sampleHeading")).getText());
				d.close();
			}
		}
		

	}

}
