package com.app.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class javaToJsonConverter {

	public static void main(String[] args) throws Exception  {
		
		
		Author author = new Author();
		
		author.setAuthorName("Rod Johnson");
		author.setAuthorEmail("r.john@gmail.com");
		author.setAuthorPhno(98867644);
		
		
		Book book = new Book();
		book.setId(101);
		book.setName("Spring Boot");
		book.setPrice(350.00);
		
		ObjectMapper mapper = new ObjectMapper();
		
		//converting java obj to Json and store into file
		
		mapper.writeValue(new File("book.json"), book);
		
		System.out.println("Conversion Completed...");
		
		

	}

}
