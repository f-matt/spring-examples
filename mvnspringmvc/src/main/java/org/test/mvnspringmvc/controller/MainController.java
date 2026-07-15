package org.test.mvnspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/hello")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Spring Boot / Thymeleaf Test");
		return "welcome";
	}

}
