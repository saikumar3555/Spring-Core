package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.dao.BookDApImpl;
import com.ibm.entity.Book;

@Service(value="bookService")
public class BookService {
	
	
	
	
	boolean bookSaveResult=false;
	
	@Autowired
	BookDApImpl  bookDAOImpl;
	
	
	public void saveBooks(List<Book> books) {
		
		books.forEach((book)->{
			bookSaveResult=bookDAOImpl.saveBook(book);
		});
	}

}
