package module1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class urlcheck {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream("C:\\Users\\beris\\Downloads\\linkNames.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Row r=null;
		String s2="";
		Cell c=null;
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
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
			String s1=d.getCurrentUrl();
			d.navigate().back();
			//d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			a=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			c1= a.findElements(By.tagName("a"));
			//c1.get(i).click();
			//b= a.findElements(By.tagName("a"));
			
			r=ws.createRow(i);
			Iterator<Row>row=ws.iterator();
			if(row.hasNext()) {
				
		    r=row.next();
			Iterator<Cell>cell=r.iterator();
			if(cell.hasNext()) {
				
			c=cell.next();
			    s2=c.getStringCellValue();
			System.out.println(s2);
			
			r.createCell(3).setCellValue(c1.get(i).getText());
			}
			}
			

	  }
		d.close();
  }
}
