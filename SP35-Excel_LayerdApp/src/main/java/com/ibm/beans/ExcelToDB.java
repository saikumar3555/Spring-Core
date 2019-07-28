package com.ibm.beans;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import com.ibm.entity.Book;

@Component
public class ExcelToDB {
	int rownum = 0;

	public List<Book> excelDataToList(String fileName) throws Exception {

		List<Book> bookList = new ArrayList<>();
		FileInputStream fis = new FileInputStream(fileName);

		Workbook workbook = new HSSFWorkbook(fis);

		Sheet sheet = workbook.getSheetAt(0);

		//getting rows
		Iterator<Row> iterator = sheet.iterator();
		while (iterator.hasNext()) {
			Row row = iterator.next();
			
			//to avoid reading  first row
			if(row.getRowNum()!=0) {
            
			//getting cells 
			Iterator<Cell> cellIterator = row.iterator();
			Book book = new Book();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				int cellIndex = cell.getColumnIndex();

				switch (cellIndex) {
				case 0:
					//book.setBookId(Integer.parseInt(s)(cell.getNumericCellValue());
					String id=String.valueOf(Math.round(cell.getNumericCellValue()));
					book.setBookId(Integer.parseInt(id));
					break;
				case 1:
					book.setBookName(cell.getStringCellValue());
					break;
				case 2:
					book.setBookPrice(cell.getNumericCellValue());
					break;
				case 3:
					book.setBookAuthor(cell.getStringCellValue());
					break;
				}
			} // inner while
			bookList.add(book);
		} // outer while
		}//if
		workbook.close();
		fis.close();
		return bookList;
	}// excelDataToList
}// class
