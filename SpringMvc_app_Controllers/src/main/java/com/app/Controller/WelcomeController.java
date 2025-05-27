package com.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMesg() {
		
	ModelAndView mvn = new ModelAndView();
	//Setting View Name
	mvn.addObject("mesg","Welcome to Spring Boot"); 
	
	mvn.setViewName("welcome");
	
	return mvn;
	
	}

}
