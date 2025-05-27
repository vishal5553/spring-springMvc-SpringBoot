package com.app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class WishController {
	
	@GetMapping("/wish")
	@ResponseBody
	
	public String getWishMesg() {
		String mesg = "All the best from Wish Controller";
		//Return Direct Response
		return mesg;
	
	}

}
//@RestController = @Controller + @ResponseBody