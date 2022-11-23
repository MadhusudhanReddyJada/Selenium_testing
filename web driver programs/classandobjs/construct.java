package classandobjs;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class construct {
	static ChromeDriver d;
	 construct() {
		d.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		d.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		d.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		d.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(d.getTitle());
		//String s1="user1",s2="123";
		construct c= new construct();
		

	}


}
