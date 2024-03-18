package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditional_statements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com/"); 

		 // Maximize browser window. 
		    driver.manage().window().maximize(); 

		    Thread.sleep(2000);
		
		    WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")); 
		    if(searchBox.isEnabled()) 
		    	    { 
		    	       System.out.println("Search box is enabled "); 
		    	    } 
		    System.out.println(searchBox.isDisplayed()); 
		    System.out.println("Search box is selected "+searchBox.isSelected());
		 
	}

}
