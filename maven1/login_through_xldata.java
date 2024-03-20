package maven1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_through_xldata {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		String path="C:\\\\Users\\\\DTLP165\\\\Documents\\\\orangehrm_login.xlsx";
		FileInputStream input = new FileInputStream(path);
		XSSFWorkbook wb= new XSSFWorkbook(input);
		XSSFSheet s=wb.getSheet("Sheet1");
		WebDriver d= new ChromeDriver();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		d.manage().window().maximize();
		// System.out.println(98);
//	   Iterator i=s.iterator();
//	   while(i.hasNext()) {
//		   System.out.println(98);
//		   XSSFRow r=(XSSFRow) i.next();
//		   Iterator j=r.iterator();
//		   while(i.hasNext()) {
//			   System.out.println(9);
//			   XSSFCell c=(XSSFCell) j.next();
//			   System.out.println(c);
//			   System.out.println(8);
//		   }
//	   }
		 int r=s.getLastRowNum();
		 int c=s.getRow(0).getLastCellNum();
		 // System.out.println(r+c);
		 for(int i=0;i<=r;i++) {
			//  System.out.println(98);
			 XSSFRow row=s.getRow(i);
			 Thread.sleep(5000);
				 String uname=row.getCell(0)+"";
				 
				 String pass=row.getCell(1)+"";
				 System.out.println(uname+"  "+pass);
				 Thread.sleep(5000);
				 d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(uname);
				 d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pass);
				 d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				 Thread.sleep(5000);
				 d.navigate().back();
				 d.navigate().back();
			 
		 }
		

	}

}
