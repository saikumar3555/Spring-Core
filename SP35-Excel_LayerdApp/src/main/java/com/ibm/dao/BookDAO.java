package com.ibm.dao;

import java.util.List;

import com.ibm.entity.Book;

public interface BookDAO {
	
	public boolean saveBook(Book book);
	
	public List<Book> getBooks();

}
