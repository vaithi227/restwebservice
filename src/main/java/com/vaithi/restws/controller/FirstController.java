package com.vaithi.restws.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vaithi.restws.model.Employee;

@Controller
public class FirstController {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(FirstController.class);
	
	@RequestMapping("/login")
	//@ResponseBody
	public String login(@ModelAttribute("empdetails") Employee empObj, Model modelObj) {
		modelObj.addAttribute("message", "employee details");
		LOGGER.info("Logging in");
		System.out.println("Logging in");
		
		//modelObj.addAttribute("username", loginDataObj.getUserName());
/*		if (null!=username)
			modelObj.addAttribute("username", username);*/
		//modelObj.addAttribute("userObject", new LoginCredentials());
		return "login";
	}

}
