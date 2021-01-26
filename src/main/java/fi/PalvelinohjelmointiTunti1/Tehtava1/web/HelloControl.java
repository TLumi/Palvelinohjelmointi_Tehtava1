package fi.PalvelinohjelmointiTunti1.Tehtava1.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody

public class HelloControl {
	
	@RequestMapping("/index")
	public String index() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "This is the contact page";
	}
		
	}	
