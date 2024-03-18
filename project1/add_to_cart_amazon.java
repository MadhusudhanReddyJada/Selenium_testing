package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_to_cart_amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=3909942701531782917&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9184631&hvtargid=kwd-10573980&hydadcr=14453_2367553&gad_source=1");
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(10000);
		d.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
		d.findElement(By.xpath("//*[@id=\"sobe_d_b_7_2\"]/a/div[1]/img")).click();
		Thread.sleep(2000);
		
		d.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
		//d.switchTo().frame(1);
		Thread.sleep(2000);
		d.findElement(By.xpath("/html/body/div[8]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/span/span/input")).click();
		Thread.sleep(2000);
		d.navigate().back();
		d.navigate().back();
		d.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[4]/span[1]")).click();
		//*[@id="a-page"]/div[1]/div[2]/div[3]/div[1]/div/div/div/ul/li[6]/span/span/div/a/div/div
		d.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[2]/div[3]/div[1]/div/div/div/ul/li[6]/span/span/div/a/div/div\r\n")).click();
		d.findElement(By.xpath("//*[@id='acsProductBlockV2-0']/a/div[1]/img")).click();
		d.findElement(By.xpath("/html/body/div[2]/div/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		Thread.sleep(2000);
		d.close();
		
	}

}
