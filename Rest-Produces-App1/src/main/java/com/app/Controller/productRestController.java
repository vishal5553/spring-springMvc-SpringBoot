package com.app.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.binding.Products;

@RestController
public class productRestController {
	
	/*
	 * @GetMapping(value ="/product" , produces = {"application/xml",
	 * "application/json"})
	 */
	
	@GetMapping("/product")
	public ResponseEntity<Products> getProduct(){
		
		Products products = new Products();
		
		products.setPid(101);
		products.setPname("Mouse");
		products.setPrice(450.00);
		
		return new ResponseEntity<>(products, HttpStatus.OK);
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<Products>> getProducts(){
		
		Products p1 = new Products(102, "Cpu", 53000.00);
		Products p2 = new Products(103, "Monitor",73000.00);
		Products p3 = new Products(104, "PS-5", 50000.00);
		
		List<Products> prodct = Arrays.asList(p1,p2,p3);
		return new ResponseEntity<>(prodct,HttpStatus.OK);
	}
	

}
