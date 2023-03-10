package com.obsqura.mavenprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f= new FileInputStream(new File("C:/Users/Thomas/Desktop/obsq.xlsx"));
	    
	    	XSSFWorkbook wb = new XSSFWorkbook(f);
	    	XSSFSheet ws= wb.getSheetAt(0);
			for(Row row: ws)     //iteration over row using for each loop  
			{  
			for(Cell cell: row)    //iteration over cell using for each loop  
			{  
				System.out.print(cell+" ");
			}
			System.out.println();
			}
	}
	
}
