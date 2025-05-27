package com.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class GreetController {
	
	@GetMapping("/greet")
	public String getGreetMwsg(Model model) {
		model.addAttribute("mesg", "msgTxt-GoodMorning");
		//Returning View Name
		return "greet";
	}

}
