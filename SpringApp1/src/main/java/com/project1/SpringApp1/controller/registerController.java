package com.project1.SpringApp1.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project1.SpringApp1.constant.ViewConstant;
import com.project1.SpringApp1.model.PersonData;
import com.project1.SpringApp1.service.UserService;

@Controller
@RequestMapping
public class registerController {
	
	//4 Add new annotations
	@Autowired
	@Qualifier("userServiceImpl") //From service>>impl>>UserServiceImpl
	private UserService userService; //From service>>UserService
	
	//2
	//It produces when we press cancel button//
	@GetMapping("/cancel")
	public String cancel() {
		return ViewConstant.INDEX; //From ViewConstant Class//
	}
	//1
	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("personData",new PersonData());
		return "register";
	}
	//3
	@PostMapping("/register")
	public String addUser(@ModelAttribute(name="personData")PersonData personData,
			Model model) {
		//6 From service>>UserService
		if(null != userService.addUser(personData)) {
			model.addAttribute("result",1); //Show the result when a new user has been registered//
		}else {
			model.addAttribute("result",0);
		}
		return ViewConstant.REGISTER;
	}
	
}
