package com.spanishTax.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spanishTax.entity.PersonData;
import com.spanishTax.model.PersonModel;
import com.spanishTax.service.Form303Service;

@Controller
@RequestMapping
public class Form303 {

	// Variables
	public static final String FORM303 = "/form303";
	public static final String DATA1 = "/addData";
	public static final Log LOG = LogFactory.getLog(StartPage.class);
	public static final String PDATA="addData";
	public static final String REMOVE = "/removecontact";

	// Date
	Date date = new Date();
	SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yy");
	
	//Define Autowired
	@Autowired
	@Qualifier("form303Impl") //Passing Form303ServiceImpl
	private Form303Service form303Service;

	@GetMapping(FORM303) //Method GET is included
	public String form303(Model model) {
		LOG.info("Date: " + sft.format(date));
		model.addAttribute("personaData", new PersonData()); //Passing object's name of Entity
		return FORM303;
	}
	
	
	@PostMapping(FORM303) //Method POST
	public String addData(@ModelAttribute(name="personaData") PersonModel personModel, Model model) {
		if(form303Service.addPersonData(personModel) != null) {
			model.addAttribute("result", 1); //Result of query
			LOG.info("METHOD addData() --PARAMS: "+personModel.toString()); //Check the correct data from console
		}else {
			model.addAttribute("result", 0); //Result of query
			LOG.info("Error with INSERT into DataBase");
		}
		return FORM303; //If the user is added, it returns to addData.html
	}
	
	@GetMapping(DATA1)
	public ModelAndView showData() {
		System.out.println("Showing Data List!!");
		ModelAndView mav = new ModelAndView(PDATA);
		mav.addObject("addData",form303Service.listAllPersons()); //List Users on DB
		return mav;
	}
	
	//Remove User
	@GetMapping(REMOVE)
	public ModelAndView removeContact(@RequestParam(name="id", required=true)int id) {
		form303Service.removeContact(id); //Remove
		System.out.println("Delete User with ID = "+id);
		return showData();
	}
	
	
}
