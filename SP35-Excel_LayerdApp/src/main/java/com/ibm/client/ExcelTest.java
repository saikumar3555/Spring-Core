package com.ibm.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.beans.DBToExcel;
import com.ibm.beans.ExcelToDB;
import com.ibm.cfgs.AppConfig;
import com.ibm.entity.Book;
import com.ibm.service.BookServiceImpl;

public class ExcelTest {

	public static void main(String[] args) throws Exception {
		System.out.println("main method started...");

		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//get All Books from DB & Write to excel
		
		BookServiceImpl bookService=context.getBean(BookServiceImpl.class);
		List<Book> books=bookService.getAllBooks();
		
		DBToExcel toExcel=context.getBean(DBToExcel.class);
		toExcel.listDataToExcel(books);
		
		
		//Read Data From Excel Store into DB
		
		/*ExcelToDB excelToDB=context.getBean(ExcelToDB.class);
		List<Book> listOfBooks=excelToDB.excelDataToList("BooksInsert.xLS");
		
		BookServiceImpl bookService=context.getBean(BookServiceImpl.class);
		bookService.saveBooks(listOfBooks);*/
		
		
		
		System.out.println("main method ended...");
	}//main

}//class
