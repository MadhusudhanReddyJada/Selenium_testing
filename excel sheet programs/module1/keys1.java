package module1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class keys1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		keys k=new keys();
		FileInputStream f=new FileInputStream("C:/Book2.xlsx");
		XSSFWorkbook wc=new XSSFWorkbook(f);
		XSSFSheet s=wc.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		Iterator<Row> row=s.iterator();
		while(row.hasNext())
		{
			r=row.next();
			c=r.getCell(2);
			String s1=c.getStringCellValue();
			if(s1.equals("opening_browser"))
				k.opening_browser();			
			else if(s1.equals("navigate"))
				k.navigate();
			else if(s1.equals("username"))
				k.username();
			else if(s1.equals("password"))
				k.password();
			else if(s1.equals("close"))
				k.close();
		}
		wc.close();

	}

}
