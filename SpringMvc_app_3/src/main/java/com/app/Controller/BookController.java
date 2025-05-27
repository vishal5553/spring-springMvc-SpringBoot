package com.app.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.binding.Book;

@Controller
public class BookController {
	@GetMapping("/book")
	
	public String BookData(Model model) {
		Book ObjBook = new Book(101, "Spring Boot", 350);
		//Setting data to binding Object
		
		//adding data to model object to send UI
		model.addAttribute("Book", ObjBook);
		
		return "Book";
		
	}
	
	@GetMapping("/books")
	 public String getBooksData(Model model) {
		//String data to binding object 
		
		Book b1 = new Book(101, "Spring Boot",350);
		Book b2 = new Book(102, "JDBC",150);
		Book b3 = new Book(103, "Hibernate",250);
		
	    List<Book> bookList = Arrays.asList(b1,b2,b3);
	    
	    //adding data to model obj to send UI
	    
	    model.addAttribute("books",bookList);
		
	    //return view name
		return"books";
	}
	
	

}
