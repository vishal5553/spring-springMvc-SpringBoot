package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.binding.User;

import jakarta.validation.Valid;

@Controller
public class userController {
	
	@GetMapping("/")
	 public String getForm(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		
		
		return "index";
		
	}
	@PostMapping("/register")
	public String handleRegisterBtn(@Valid User userForm,BindingResult result, Model model ) {
		
		if(result.hasErrors()) {
			return "index";
		}
		
		
		System.out.println(userForm);
		model.addAttribute("mesg", "your registration success...!");
		
		
		return "success";
		
	}
	

}
