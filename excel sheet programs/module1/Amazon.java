package module1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("C:\\AmazonDropDown.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r=null;
	
		Cell c=null;
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
		WebElement w=d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		List<WebElement> c1=w.findElements(By.tagName("option"));
		System.out.println(c1.size());
		for(int i=0;i<c1.size();i++) {
			System.out.println(c1.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(c1.get(i).getText());
			c1.get(i).click();
			if(c1.get(i).isSelected()) {
				r.createCell(1).setCellValue("pass");
				
			}
			else {
				r.createCell(1).setCellValue("fail");
			}
			
			
		}
		FileOutputStream f1= new FileOutputStream("C:\\AmazonDropDown.xlsx");
		wb.write(f1);
		f1.close();
		

	}

}
