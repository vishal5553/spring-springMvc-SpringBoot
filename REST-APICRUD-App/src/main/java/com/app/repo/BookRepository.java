package com.app.repo;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

	
	
	
	

}
