package project1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshots {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		WebDriver d= new ChromeDriver();
		d.get("https://demo.automationtesting.in/Alerts.html");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Thread.sleep(2000);
		d.manage().window().maximize();
		TakesScreenshot t= (TakesScreenshot)d;
		File src=t.getScreenshotAs(OutputType.FILE);
		File target=new File("C:\\screenshots\\home.png");
		FileHandler.copy(src,target);

	}

}
