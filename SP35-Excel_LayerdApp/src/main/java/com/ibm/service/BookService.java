package com.ibm.service;

import java.util.List;

import com.ibm.entity.Book;

public interface BookService {
	
	public void saveBooks(List<Book> books);
	
	public List<Book> getAllBooks();

}
