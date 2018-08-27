package com.spanishTax.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class TaxModels {

	//Variables
	public static final String MODEL = "/models";
	public static final Log LOG =LogFactory.getLog(TaxModels.class);
	
	@GetMapping(MODEL)
	public String models(){
		LOG.info("Access to: "+MODEL+ " Correct!!!");
		return MODEL;
	}
}
