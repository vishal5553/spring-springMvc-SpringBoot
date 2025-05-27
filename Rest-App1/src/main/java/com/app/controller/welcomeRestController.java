package com.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeRestController {
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMesg(@RequestParam("name")String name){
		String respPayload = name+ " ,welcome to Tdit";
		
		return new ResponseEntity<>(respPayload, HttpStatus.OK);
		
	}
	
	@GetMapping("/greet")
	public String getGreetMesg() {
		String respPayload = "Good Morning";
		return respPayload;
	}
	
	
	
	
	

}
