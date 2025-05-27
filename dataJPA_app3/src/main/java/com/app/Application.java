package com.app; 

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.app.entity.User;
import com.app.repository.userRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	    
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		userRepository repository = context.getBean(userRepository.class);
		
		User user4 = new User(5,"Vipul",23,"Male","NYC");
		User user5 = new User(6,"Vinay",36,"Male","India");
		User user6 = new User(7,"Nehal",23,"Female","NYC");
		User user7 = new User(8,"Guru",46,"Male","India");
		User user8 = new User(9,"Nisha",33,"Female","USA");
		User user9 = new User(10,"Vinet",26,"Male","USA");
		
		repository.saveAll(Arrays.asList(user4,user5,user6,user7,user8,user9));
		/*
		 * List<User> list = repository.findAll(Sort.by("userName","age").descending());
		 * list.forEach(user -> { System.out.println(user); });
		 */
		
		//Pagination
		
		/*
		 * int pageSize = 3; int pageNo = 2;
		 * 
		 * PageRequest pageRequest = PageRequest.of(pageNo-1,pageSize); Page<User> page
		 * = repository.findAll(pageRequest);
		 * 
		 * int totalPages = page.getTotalPages(); System.out.println("total pages : " +
		 * totalPages);
		 * 
		 * List<User> list = page.getContent(); list.forEach(users -> {
		 * System.out.println(users); });
		 * 
		 */
		
		//QBE Query by Example
		
		User entity = new User();
		entity.setCountry("India");
		
		Example<User> example = Example.of(entity);
		List<User> list = repository.findAll(example);
		list.forEach(use -> {
			System.out.println(use);
		});
		
		
		
		
		
	}}