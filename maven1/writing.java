package maven1;

import java.io.FileInputStream;
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

public class writing {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("C:\\\\Users\\\\DTLP165\\\\Documents\\\\NewTours.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r=null;
	
		Cell c=null;
		//System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
		d.manage().window().maximize();
		//d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		WebElement a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement> c1= a.findElements(By.tagName("a"));
		System.out.println(c1.size());
		for(int i=0;i<c1.size();i++)
		{
			System.out.println(c1.get(i).getText());
			c1.get(i).click();
			Thread.sleep(1000);
			r=ws.createRow(i);
			r.createCell(1).setCellValue(d.getCurrentUrl());
			d.navigate().back();
			//d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			c1= a.findElements(By.tagName("a"));
			//c1.get(i).click();
			//b= a.findElements(By.tagName("a"));
			
			
			
			r.createCell(0).setCellValue(c1.get(i).getText());
			
			
			//c1.get(i).click();
			if(!c1.get(i).isSelected()) {
				r.createCell(2).setCellValue("pass");
				
			}
			else {
				r.createCell(2).setCellValue("fail");
			}
			
		}
		FileOutputStream f1= new FileOutputStream("C:\\\\Users\\\\DTLP165\\\\Documents\\\\NewTours.xlsx");
		wb.write(f1);
		f1.close();
		d.close();
	}

}
