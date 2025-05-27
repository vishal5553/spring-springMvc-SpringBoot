package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.binding.Book;

@Controller
public class bookController {
	 @GetMapping("/")
	
	public String displayForm(Model model) {
		 
		 Book bookObj = new Book();
		 model.addAttribute("book", bookObj);
		
		return "index";
		
	}
	 
	 @PostMapping("/book")
	    public String submitBook(Book book , Model model) {
	        // Handle the book submission
	        System.out.println(book);
	        model.addAttribute("mesg", "Book Saved Successfully...");
	        return "success"; 

	
	
	 }
}
