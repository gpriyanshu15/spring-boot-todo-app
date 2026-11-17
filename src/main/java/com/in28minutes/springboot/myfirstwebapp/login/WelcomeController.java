package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

	@GetMapping(value="/")
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", "in28minutes");
		return "welcome";
	}
}