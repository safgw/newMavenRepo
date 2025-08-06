package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRead1 {
	
	
	// FileInputStream , XSSFWorkbook, XSSFSheet, XSSFRow, XSSFCell are inbuilt classes 
	// getSheet, getRow, getCell , getStringCellValue are inbuilt methods
	
	static FileInputStream f; //excel file path
	static XSSFWorkbook w; //Filename
	static XSSFSheet s;// Sheet Name
	
	//Below is the getter/setter method
	// throws is given because - its an external file and there are possibilities of error
	
	
	//Below Method is to fetch all the String values in the Excel
	public static String getStringData(int a,int b) throws IOException // a is row ,b is column or cell
	{
		f=new FileInputStream("C:\\Users\\himaa\\OneDrive\\Desktop\\Java\\Java_Excel.xlsx");
		w=new XSSFWorkbook(f); // gets the name of the file from f
		s=w.getSheet("Sheet1");// gets the name of the sheet from w
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue(); //inbuilt method for excelsheet connection
	}
	
	
	//Below Method is to fetch all the Integer values in the Excel. Its converted to String
	//because the exact value is returned. Otherwse .0 will be added towards the end of numbers
	public static String getIntegerData(int a,int b) throws IOException { 
		f=new FileInputStream("C:\\Users\\himaa\\OneDrive\\Desktop\\Java\\Java_Excel.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int y=(int) c.getNumericCellValue();// string - integer  = typecasting
		return String.valueOf(y);
		
		// if we comment out 45 and return String.valueOf(c) and execute the pgm, the int value has xxxx.0;
	}

}


