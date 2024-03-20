package maven1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class reading_xl {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String path="C:\\Users\\DTLP165\\Documents\\Book1.xlsx";
		FileInputStream input=new FileInputStream(path);
		XSSFWorkbook w=new XSSFWorkbook(input);
		XSSFSheet s=w.getSheet("Sheet1");
		int rows=s.getLastRowNum();
		int cols=s.getRow(1).getLastCellNum();
		try {
		for(int r=0;r<=rows;r++) {
			XSSFRow row=s.getRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell col=row.getCell(c);
				//System.out.println(col.getCellType());
				System.out.print(col.getStringCellValue());
				System.out.print("     |    ");
			}
			System.out.println();
		}
		}catch(NullPointerException e) {
			System.out.println(e);
		}
		w.close();
		

	}

}
