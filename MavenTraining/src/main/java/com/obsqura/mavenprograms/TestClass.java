package com.obsqura.mavenprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestClass {
	/*
	 * Iterator<Row> itrRow = xSheet.iterator(); while(itrRow.hasNext()) { Row rw =
	 * itrRow.next(); Iterator<Cell> itrCell = rw.cellIterator();
	 * while(itrCell.hasNext()) { Cell cl = itrCell.next();
	 * System.out.print(cl.toString() + " || "); } System.out.println(); }
	 * xWB.close(); fisexcel.close(); }
	 */

	/*
	 * public ArrayList<String> excelread(String supDtl) throws IOException {
	 * 
	 * ArrayList<String> supExcel = new ArrayList<String>();
	 * 
	 * File excelfile = new File("C:/Users/Thomas/Desktop/obsq.xlsx");
	 * FileInputStream fisexcel = new FileInputStream(excelfile);
	 * 
	 * XSSFWorkbook xWB = new XSSFWorkbook(fisexcel); XSSFSheet xSheet =
	 * xWB.getSheetAt(0);
	 * 
	 * int sheets = xWB.getNumberOfSheets(); for(int i=0;i<sheets;i++) {
	 * if(xWB.getSheetName(i).equalsIgnoreCase("Supplier")) { //working on the right
	 * sheet XSSFSheet sheet = xWB.getSheetAt(i); Iterator<Row> rows =
	 * sheet.rowIterator();
	 * 
	 * //getting access to the specific row which is the first row Row firstrow =
	 * rows.next();
	 * 
	 * //once is the column is identified;scan for Sadmin Iterator<Cell> cell =
	 * firstrow.cellIterator(); int k=0; int col=0; //Identifying the coulmn
	 * TestCases by scanning the entire row using cell iterator
	 * while(cell.hasNext()) { Cell value = cell.next();
	 * if(value.getStringCellValue().equalsIgnoreCase("TestCases")) { col=k; } k++;
	 * } //System.out.println(col); //now scan the entire row and get all the
	 * deatils in the row while(rows.hasNext()) { Row r = rows.next();
	 * 
	 * if(r.getCell(col).getStringCellValue().equalsIgnoreCase("Testcase")) {
	 * Iterator<Cell> cells = r.cellIterator(); cells.next(); while(cells.hasNext())
	 * //type = string { supExcel.add(cells.next().getStringCellValue());
	 * 
	 * }
	 * 
	 * //case 2 numeric
	 * 
	 * supExcel.add(NumberToTextConverter.toText(cell.next().getNumericCellValue()))
	 * ; }
	 * 
	 * 
	 * } } } return supExcel; }
	 */
}
