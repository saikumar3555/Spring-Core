package com.nt.beans;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.stereotype.Component;

@Component
public class WriteDataToExcel {
	
	public void writeDataToExcelFile() throws Exception {
		
		//create file output stream
		FileOutputStream fos=new FileOutputStream("UserDetl.xls");
		
		//create workbook
		HSSFWorkbook book=new HSSFWorkbook();
		
		//create sheet
		Sheet sheet=book.createSheet();
		
		//create Row
		Row row0=sheet.createRow(0);
		
		//create cell  and assign values
		row0.createCell(0).setCellValue("User");
		row0.createCell(1).setCellValue("MailID");
		row0.createCell(2).setCellValue("Phno");
		
		Row row1=sheet.createRow(1);
		row1.createCell(0).setCellValue("Sohan");
		row1.createCell(1).setCellValue("sohan@123");
		row1.createCell(2).setCellValue("+91-26235");
		
		book.write(fos);
		book.close();
		
		
		
		
	}//method

}//class
