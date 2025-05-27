package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.binding.Book;

@RestController
public class BookRestController {
	
	@PostMapping(
			value = "/book",
			consumes = {"application/json", "application/xml"}
			)
	public  ResponseEntity<String> addBook(@RequestBody Book book){
		System.out.println(book);
		
		// Logic to store db
		
		String msg = "Book Added Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}

}
