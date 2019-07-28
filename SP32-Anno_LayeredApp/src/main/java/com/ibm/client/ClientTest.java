package com.ibm.client;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.cfgs.AppConfig;
import com.ibm.entity.Book;
import com.ibm.service.BookService;
import com.ibm.utility.HibernateUtils;
import com.nt.beans.CSVReader;

public class ClientTest {
	

	public static void main(String[] args) {

		List<Book> bookList =CSVReader.readBooksFromCSV("Book.txt");

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BookService service = context.getBean("bookService", BookService.class);
		service.saveBooks(bookList);

		HibernateUtils.closeSessionFactory();
	}// main

	

}// class
