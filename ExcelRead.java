package com.obsqurazone.maventraining;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws Exception {
		ArrayList excelList = new ArrayList();
		File file = new File("C:/Users/Thomas/Desktop/obsq.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook xwb = new XSSFWorkbook(fis);
		XSSFSheet xsht = xwb.getSheetAt(0);
		
		Iterator<Row> itrrw = xsht.iterator();
		while(itrrw.hasNext()) {
			Row row =itrrw.next();
			Iterator<Cell> itrcl = row.cellIterator();
			
			while(itrcl.hasNext()) {
				Cell cell = itrcl.next();
				switch(cell.getCellType()) {
				case Cell.CELL_TYPE_STRING: 
						System.out.print(cell.getStringCellValue()+ "\t\t");
						excelList.add(cell.getRichStringCellValue());
						break;
				case Cell.CELL_TYPE_NUMERIC:
						System.out.print(cell.getNumericCellValue() + "\t\t\t");
						excelList.add(cell.getNumericCellValue());
				break;				
				}					
			}	
			System.out.println("\n");
			excelList.add("\n");
		}
		System.out.println(excelList);
		xwb.close();
	}

}
