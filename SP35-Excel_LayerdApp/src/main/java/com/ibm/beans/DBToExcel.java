package com.ibm.beans;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.stereotype.Component;

import com.ibm.entity.Book;

@Component	
public class DBToExcel {
	 int rowNum = 1;
	int cellNum = 0;

	public void listDataToExcel(List<Book> listOfBooks) throws Exception {

		// create file output stream
		FileOutputStream fos = new FileOutputStream("BookDetails.xls");

		// create workbook
		HSSFWorkbook book = new HSSFWorkbook();

		// create sheet
		Sheet sheet  = book.createSheet();
		
		//Fixed First Row in Sheet Headers
		 /*Row row1=sheet.createRow(1);
		Cell cell0=row1.createCell(0);
		cell0.setCellType(String);
		row1.createCell(1).setCellValue("ghfg");*/
		//create Row
				Row row0=sheet.createRow(0);
				
				//create cell  and assign values
				row0.createCell(0).setCellValue("BookID");
				row0.createCell(1).setCellValue("BookName");
				row0.createCell(2).setCellValue("Price");
				row0.createCell(3).setCellValue("Author");
		
		
		// getting each Book from List Of Books
		listOfBooks.forEach(eachBook -> {
			
			// create row for each time
			Row row = sheet.createRow(rowNum++);

			//to add each book property values to list
			List<String> list = new ArrayList();

			list.add(String.valueOf(eachBook.getBookId()));
			list.add(eachBook.getBookName());
			list.add(String.valueOf(eachBook.getBookPrice()));
			list.add(eachBook.getBookAuthor());

			for (String value : list) {
				Cell cell = row.createCell(cellNum++);
				cell.setCellValue(value);
			}
			cellNum=0;

		});

		book.write(fos);
		book.close();
		fos.close();

	}// method

}// class

/*
 * String[] arr = new String[4]; arr[0] = String.valueOf(eachBook.getBookId());
 * arr[1] = eachBook.getBookName(); arr[2] =
 * String.valueOf(eachBook.getBookPrice()); arr[3] = eachBook.getBookAuthor();
 */
/*
Row row0 = sheet.createRow(0);
row0.createCell(0).setCellValue("df");
// row0.createCell(0).setCellValue("BOOKID");
 row0.createCell(1).setCellValue("BOOKNAME");
 row0.createCell(2).setCellValue("BOOKPRICE");
 row0.createCell(3).setCellValue("BOOKAUTHOR");
*/