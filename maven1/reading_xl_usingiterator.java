package maven1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reading_xl_usingiterator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\DTLP165\\Documents\\Book1.xlsx";
		FileInputStream input=new FileInputStream(path);
		XSSFWorkbook w=new XSSFWorkbook(input);
		XSSFSheet s=w.getSheet("Sheet1");
		Iterator i=s.iterator();
		while(i.hasNext()) {
			XSSFRow r=(XSSFRow) i.next();
			Iterator j=r.iterator();
			while(j.hasNext()) {
				System.out.print(j.next()+"  |  ");
				
			}
			System.out.println();
		}
//		XSSFRow r=s.createRow(4);
//		r.createCell(5).setCellValue(path);
//		r.createCell(2).setCellValue("hello");
//		FileOutputStream output = new FileOutputStream(path);
//		w.write(output);

	}

}
