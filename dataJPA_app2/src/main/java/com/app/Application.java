package com.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.entity.User;
import com.app.repository.userRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
    
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		userRepository repository = context.getBean(userRepository.class);
		
		/*
		 * User user = new User(); user.setUserId(2); user.setUserName("John Doe");
		 * user.setAge(30); user.setCountry("USA"); user.setGender("Male");
		 * 
		 * // repository.save(user);
		 * 
		 * User user2 = new User(3,"Neha",23,"Female","NYC"); User user3 = new
		 * User(4,"Vish",26,"Male","India");
		 * 
		 * // repository.saveAll(Arrays.asList(user2,user3));
		 * 
		 * Optional<User> findById =repository.findById(4); if(findById.isPresent()) {
		 * System.out.println(findById.get()); }
		 */
		    
		/*
		 * Iterable<User> allById = repository.findAllById(Arrays.asList(1,3,4));
		 * allById.forEach(user -> { System.out.println(user); });
		 */
		/*
		 * Iterable<User> findall = repository.findAll(); findall.forEach(user -> {
		 * System.out.println(user); });
		 */
		
		
		/*
		 * Long Records = repository.count(); System.out.println("Total Records:" +
		 * Records);
		 */
		
		/*
		 * Boolean Exits = repository.existsById(4);
		 * System.out.println("Record Exist: "+ Exits);
		 */
		    
		//repository.deleteById(2);
		//repository.deleteAllById(Arrays.asList(1,3));
		
		//select * from user where user_country=?
		/*
		 * List<User> findByCountry= repository.findByCountry("India");
		 * findByCountry.forEach(user1 -> { System.out.println(user1); });
		 *
		 */
		
		//select * from user where user_age=? 
		/*
		 * List<User> findByAge =repository.findByAge(30);
		 * 
		 * findByAge.forEach(Users -> { System.out.println(Users); });
		 * 
		 */
		 
		
		 //select * from user where user_country in =(?,?,?...) 
			/*
			 * List<User> list = repository.findByCountryIn(Arrays.asList("India", "USA") );
			 * 
			 * list.forEach(users -> { System.out.println(users); });
			 */
		
		  //select * from User where user_country ='India' and user_ag=26 and user_gender= 'male' 
			/*
			 * List<User> list = repository.findByCountryAndAgeAndGender("India", 26,
			 * "Male"); list.forEach(users->{ System.out.println(users); });
			 */
		
		
	    
		
		
	}

}
