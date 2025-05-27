package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class secondControleer {
	@GetMapping("/wish")
	public ModelAndView getWishMesg() {
		
	ModelAndView mvn = new ModelAndView();
	
	mvn.addObject("mesg","All the best");
	
	mvn.setViewName("wish");
	
	return mvn;
	
	}
	
}
