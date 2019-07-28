package com.nt.beans;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.stereotype.Component;

@Component
public class WriteListOfDataToExcel {

	public void listDataToExcel() throws Exception {

		// create file output stream
		FileOutputStream fos = new FileOutputStream("UserDetl2.xls");

		// create workbook
		HSSFWorkbook book = new HSSFWorkbook();

		// create sheet
		Sheet sheet = book.createSheet();

		TreeMap<Integer, Object[]> map = new TreeMap<>();
		map.put(1, new Object[] { "USER", "EMAIL", "PHNO" });
		map.put(2, new Object[] { "Sai", "sai@123", "986632352" });
		map.put(3, new Object[] { "apa", "apa@", "927672576" });
		map.put(4, new Object[] { "santhosh", "san@134", "232434343" });
		map.put(5, new Object[] { "Roshan", "roshan@123", "24324324" });

		Set<Integer> keys = map.keySet();
		int rowNum = 0;
		for (Integer key : keys) {
			// each time row created
			Row row = sheet.createRow(rowNum++);
			Object[] object = map.get(key);
			//rowNum++;
			int cellNum = 0;
			for (Object value : object) {
				Cell cell = row.createCell(cellNum++);
				
				cell.setCellValue((String) value);
			}

		}

		book.write(fos);
		book.close();

	}//method

}//class
