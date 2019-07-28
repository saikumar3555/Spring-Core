package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.dao.BookDApImpl;
import com.ibm.entity.Book;

@Service(value = "bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDApImpl bookDAOImpl;

	public void saveBooks(List<Book> books) {
		books.forEach((book) -> {
			bookDAOImpl.saveBook(book);
		});
	}// saveBooks

	@Override
	public List<Book> getAllBooks() {
		List<Book> list=null;
		list=bookDAOImpl.getBooks();
		return list;
	}//getAllBooks

}// class
