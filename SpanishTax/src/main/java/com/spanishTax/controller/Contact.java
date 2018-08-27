package com.spanishTax.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spanishTax.entity.ContactData;
import com.spanishTax.model.ContactModel;
import com.spanishTax.service.ContactService;

@Controller
@RequestMapping
public class Contact {
	//Variables
	public static final String MODEL = "/contact";
	public static final String START = "/startPage";
	public static final String DATA = "/addData";
	
	public static final Log LOG =LogFactory.getLog(Contact.class);
	
	//Define Autowired
	@Autowired
	@Qualifier("contactServiceImpl") //Passing contactServiceImpl from ContactServiceImpl
	private ContactService contactService;
	
	@GetMapping(MODEL)
	public String models(Model model){
		LOG.info("Access to: "+MODEL+ " Correct!!!");
		model.addAttribute("contactData",new ContactData());
		return MODEL;
	}
	
	@PostMapping(START)
	public String addForm(@ModelAttribute(name="contactData") ContactModel contactModel, Model model) {
		if(null != contactService.addContactData(contactModel)) {
			model.addAttribute("final",1);
			LOG.info("METHOD addForm() --PARAMS: "+contactModel.toString()); //Check if parameters have passed to DB correctly
		}else {
			model.addAttribute("final", 0); //Result when parameters haven't passed to DB correctly
			LOG.info("Error with INSERT into DataBase for ContactData");
		}
		return START;
		
	}
}
