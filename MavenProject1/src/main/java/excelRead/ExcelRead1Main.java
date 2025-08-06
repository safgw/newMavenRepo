package excelRead;

import java.io.IOException;

public class ExcelRead1Main {

	public static void main(String[] args) throws IOException {
		System.out.println(excelRead1.getStringData(0, 0));
		System.out.println(excelRead1.getStringData(0, 1));
		System.out.println(excelRead1.getStringData(1, 0));
		System.out.println(excelRead1.getIntegerData(1, 1));

	}

}
