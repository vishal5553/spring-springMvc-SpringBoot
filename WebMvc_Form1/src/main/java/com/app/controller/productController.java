package com.app.controller;

import java.awt.print.Book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.binding.Product;

@Controller
public class productController {
	@GetMapping("/")
	public String getProductForm(Model model) {
		
		Product productObj = new Product();
		 model.addAttribute("product", productObj);
		 return "index";
	}
	
	@PostMapping("/product")
	
	public String handleFormSubmit(Product product, Model model) {
		System.out.println(product);
		model.addAttribute("mesg", "product saved successfully");
		return "success";
		
	}
	
	

}
