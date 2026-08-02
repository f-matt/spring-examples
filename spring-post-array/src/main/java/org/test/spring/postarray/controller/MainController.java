package org.test.spring.postarray.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.test.spring.postarray.form.FormDto;
import org.test.spring.postarray.model.TestModel;

@Controller
@RequestMapping("/hello/**")
public class MainController {
	@RequestMapping(value="index", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		model.addAttribute("message", "Maven / Spring MVC Test");
		return "welcome";
 
	}

	@RequestMapping(value="form", method = RequestMethod.GET)
	public String printForm(ModelMap model) {
 
		model.addAttribute("testModel", new TestModel());
		
		return "form";
 
	}
	
	@RequestMapping(value="action", method=RequestMethod.POST)
	public String action(@ModelAttribute("testModel") TestModel testModel, ModelMap model) {
 
		String name = testModel.getName();
		List<String> values = testModel.getValues();
		
		model.addAttribute("name", name);
		model.addAttribute("values", values);

		FormDto formDto = new FormDto();
		formDto.setTestModel(testModel);

		model.addAttribute("formDto", formDto);

		return "form-success";
	}

	@RequestMapping(value="addValue", method=RequestMethod.POST)
	public String addValue(@ModelAttribute("formDto") FormDto formDto, ModelMap model) {
		formDto.getTestModel().getValues().add(formDto.getNewValue());
		formDto.setNewValue(null);

		String name = formDto.getTestModel().getName();
		List<String> values = formDto.getTestModel().getValues();

		model.addAttribute("name", name);
		model.addAttribute("values", values);
		model.addAttribute("formDto", formDto);

		return "form-success";
	}

}
