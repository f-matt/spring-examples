package x.y.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import x.y.model.FooBarDto;
import x.y.service.FooService;

@Controller
@RequestMapping("/test")
public class MainController {
	
	@Autowired
	private FooService fooService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		FooBarDto fooBarDto = fooService.createDto(1);
		
		System.out.println(fooBarDto.toString());
		
		model.addAttribute("message", "Test ok");
		return "output";
	}
 
}
