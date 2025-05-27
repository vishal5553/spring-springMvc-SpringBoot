package com.app.service;

import java.util.List;

import com.app.entity.Book;

public interface BookService {
	
	
	public String upsertBook(Book book);
	
	public List<Book> getAllBooks();
	
	//public String UpdateBook(Book book);
	
	public String deleteBook(Integer bookId);
	

}
