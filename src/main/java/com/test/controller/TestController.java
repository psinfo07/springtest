package com.test.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {
		
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	Service service;
	
	@RequestMapping("/")
	public String welcome(ModelMap model) {
		
		model.addAttribute("key", "Hi, This is my first Spring test Project");
		logger.debug("[welcome] to Test Spring : {}");

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "index";

	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST )
	public String register(@ModelAttribute("user") User user,ModelMap model) {
		
		model.addAttribute("key", "registered successfully");
		logger.debug("[welcome] to Test Spring : {}");

		// Spring uses InternalResourceViewResolver and return back index.jsp
		return "success";

	}
}
