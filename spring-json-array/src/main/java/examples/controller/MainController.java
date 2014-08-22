package examples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import examples.model.TestModel;

@Controller
@RequestMapping("/main/**")
public class MainController {
	@RequestMapping(value="index", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		model.addAttribute("message", "Maven / Spring MVC Test");
		return "welcome";
 
	}

	/*
	 * Receives a single TestModel object: returns another TestModel object.
	 */
	@RequestMapping(value="test-json", method = RequestMethod.POST)
	public @ResponseBody TestModel testJson(@RequestBody TestModel jsonTm) {
		
		System.out.println(jsonTm.toString());
		
		TestModel tm = new TestModel();
		tm.setFirst("AAA");
		tm.setSecond("BBB");
		
		return tm;
 	}
	
	/*
	 * Receives an array of TestModel objects: returns another TestModel object.
	 */
	@RequestMapping(value="test-json-array", method = RequestMethod.POST)
	public @ResponseBody TestModel testJsonArray(@RequestBody TestModel[] jsonTmList) {
		
		for(TestModel tm : jsonTmList) {
			System.out.println(tm.toString());
		}
		
		
		TestModel tm = new TestModel();
		tm.setFirst("AAA");
		tm.setSecond("BBB");
		
		return tm;
 	}
	
	

}
