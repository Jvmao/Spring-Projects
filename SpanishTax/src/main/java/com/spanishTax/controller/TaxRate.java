package com.spanishTax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping
/*TAX RATE PAGE*/
public class TaxRate {
	//Variables
	public static final String TAXRATE = "/taxRates";
	
	@GetMapping(TAXRATE)
	public String taxRate(){
		return TAXRATE;
	}
	
	/*@RequestMapping(value=TAXRATE,method=RequestMethod.GET)
	public String startPage(){
		return TAXRATE;
	}*/
}
