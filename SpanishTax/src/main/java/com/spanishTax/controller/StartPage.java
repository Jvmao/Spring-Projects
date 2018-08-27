package com.spanishTax.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spanishTax.entity.PersonData;

@Controller
@RequestMapping
//Init Page
public class StartPage {
	//Variables
	public static final String INIT = "/startPage";
	public static final Log LOG =LogFactory.getLog(StartPage.class);
	
	//Date
	Date date = new Date();
	SimpleDateFormat sft = new SimpleDateFormat("dd/MM/yy");
	
	@GetMapping(INIT)
	public String startPage(){
		LOG.info("Date: "+sft.format(date));
		return INIT;
	}
	
	/*@RequestMapping(value=INIT,method=RequestMethod.GET)
	public String startPage(){
		return INIT;
	}*/		
}
