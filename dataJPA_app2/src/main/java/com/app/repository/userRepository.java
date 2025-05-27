package com.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.app.entity.User;

public interface userRepository extends CrudRepository<User, Integer> {
	
      //select * from user where user_country=?
	 //public List<User> findByCountry(String country);
	
	  //select * from user where user_age=? 
	  //public List<User> findByAge(Integer age);
	  
	  //select * from user where user_age=? 
	 // public List<User>findByAgeGreterThan(Integer age);
	  
	  //select * from user where user_country in =(?,?,?...) 
	  //public List<User>findByCountryIn(List<String> countries);
	  
	  //select * from User where user_country ='India' and user_ag=26 and user_gender= 'male' 
      //public List<User> findByCountryAndAgeAndGender(String cname, Integer age, String gender);
	  
	 
}
