package com.nt.beans;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ibm.entity.Book;
@Component
public class CSVReader {

	public static List<Book> readBooksFromCSV(String fileName) {
		List<Book> books = new ArrayList<Book>();

		Path path = Paths.get(fileName);

		// create BufferReadder
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.US_ASCII)) {
			String line = br.readLine();

			while (line != null) {
				String[] attributes = line.split(",");

				int bookID = Integer.parseInt(attributes[0]);
				String bookName = attributes[1];
				double bookPrice = Double.parseDouble(attributes[2]);
				String bookAuthor = attributes[3];

				// create book
				Book b = new Book(bookID, bookName, bookPrice, bookAuthor);

				// add book to List
				books.add(b);
				line = br.readLine();

			} // while
		} // try
		catch (Exception e) {
			e.printStackTrace();
		}

		return books;
	}// method
}
