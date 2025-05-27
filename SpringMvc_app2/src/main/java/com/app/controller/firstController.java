package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class firstController {
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMesg() {
		
	ModelAndView mvn = new ModelAndView();
	
	mvn.addObject("mesg","Welcome to Spring Boot");
	
	mvn.setViewName("welcome");
	
	return mvn;
	
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreetMesg() {
		
	ModelAndView mvn = new ModelAndView();
	
	mvn.addObject("mesg","Good Morning");
	
	mvn.setViewName("greet");
	
	return mvn;
}
}