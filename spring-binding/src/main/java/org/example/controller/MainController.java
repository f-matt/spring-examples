package org.example.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.example.binding.BEditor;
import org.example.binding.CEditor;
import org.example.model.A;
import org.example.model.B;
import org.example.model.C;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/main/**")
public class MainController {
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		model.addAttribute("message", "Maven / Spring MVC Test");
		return "welcome";
 
	}
	
	@RequestMapping(value="/form", method = RequestMethod.GET)
	public String printForm(ModelMap model) {
		A a = new A();
		
		B b1 = new B(0, "b1");
		B b2 = new B(1, "b2");
		B b3 = new B(2, "b3");
		
		C c1 = new C(0, "c1");
		C c2 = new C(1, "c2");
		C c3 = new C(2, "c3");
		
		Map<Integer, String> bMap = new LinkedHashMap<Integer, String>();
		bMap.put(b1.getId(), b1.getDescription());
		bMap.put(b2.getId(), b2.getDescription());
		bMap.put(b3.getId(), b3.getDescription());
		 
		List<C> cList = new ArrayList<C>();
		cList.add(c1);
		cList.add(c2);
		cList.add(c3);
		
		model.addAttribute("a", a);
		model.addAttribute("bMap", bMap);
		model.addAttribute("cList", cList);
				
		return "form";
 
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public void save(@ModelAttribute(value="a") A a, BindingResult result, ModelMap model) {
		if (a != null)
			System.out.println("a != null");
		if (a.getB() != null)
			System.out.println("b != null");
		if (a.getC() != null)
			System.out.println("c != null");
		
		System.out.printf(a.toString());
	}
	
	@InitBinder
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) {
		binder.registerCustomEditor(B.class, new BEditor());
		binder.registerCustomEditor(C.class, new CEditor());
	}
 
}

