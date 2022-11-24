package stepdefinations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class p1<XXSFworkbook> {

WebDriver d;
@Given("user is in new tours page")
public void user_is_in_new_tours_page() {
	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/");
	    d.manage().window().maximize();
}

@When("user gets uname and password from property list")
public void user_gets_uname_and_password_from_property_list() throws IOException, InterruptedException {
	pom p=new pom(d);
	p.unameandpass();
	 Thread.sleep(2000);
}

@Then("user uses pom for uname and password")
public void user_uses_pom_for_uname_and_password() {
}

@Then("user need to click on register link button")
public void user_need_to_click_on_register_link_button() throws InterruptedException {
    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
   WebElement e=d.findElement(By.name("country"));
    List<WebElement> l=e.findElements(By.tagName("option"));
    System.out.println(l.size());
    for(int i=0;i<l.size();i++) {
   	System.out.println(l.get(i).getText());
   	
   }
    Thread.sleep(2000);
}

@Then("get screenshot")
public void get_screenshot() throws IOException {
	 File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(s,new  File("C://screenshots/img1.png"));
}

@Then("gat country names into excel sheet")
public void gat_country_names_into_excel_sheet() throws IOException {
	 FileInputStream f1=new FileInputStream("C:\\Users\\beris\\OneDrive\\Documents\\madhubook.xlsx");
	 XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r=null;
	
		Cell c=null;
	WebElement e=d.findElement(By.name("country"));
    List<WebElement> l=e.findElements(By.tagName("option"));
    //System.out.println(l.size());
    for(int i=0;i<l.size();i++) {
    	r=ws.createRow(i);
    	r.createCell(0).setCellValue(l.get(i).getText());
    	l.get(i).click();
    }
    FileOutputStream f=new FileOutputStream("C:\\Users\\beris\\OneDrive\\Documents\\madhubook.xlsx");
    wb.write(f);
    wb.close();
}

@Then("user is navigate to home page and close")
public void user_is_navigate_to_home_page_and_close() {
    d.close();
}
}
