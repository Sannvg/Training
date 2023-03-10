package com.obsqura.mavenprograms;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File excelfile = new File("C:/Users/Thomas/Desktop/obsq.xlsx");
		FileInputStream fisexcel = new FileInputStream(excelfile);
		
		XSSFWorkbook xWB = new XSSFWorkbook(fisexcel);
		XSSFSheet xSheet = xWB.getSheetAt(0);
		
		Iterator<Row> itrRow = xSheet.iterator();    
		while(itrRow.hasNext()) {
			Row rw = itrRow.next();
			Iterator<Cell> itrCell = rw.cellIterator();
			while(itrCell.hasNext()) {
				Cell cl = itrCell.next();
				System.out.print(cl.toString() + " || ");
			}
			System.out.println();
		}
		xWB.close();
		fisexcel.close();
		
	}
}
