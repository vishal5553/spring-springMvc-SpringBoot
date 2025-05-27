package com.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.entity.Book;
import com.app.repo.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository repository;

	public BookServiceImpl(BookRepository repository) {
		super();
		this.repository = repository;
	}

	//@Override
	public String upsertBook(Book book) {
	 
	Integer bookId = book.getBookId();	
		System.out.println(book);  
		
	    Book save=	repository.save(book);
	    System.out.println(book);
		if(bookId==null) {
			return "Record Inserted";	
		}
		else {
			return "Record Updated";
		}
	}

	//@Override
	public List<Book> getAllBooks() {
		
		return repository.findAll();
	}

	//@Override
	public String deleteBook(Integer bookId) {
		repository.deleteById(bookId);
		return "Book Deleted";
	}

}
