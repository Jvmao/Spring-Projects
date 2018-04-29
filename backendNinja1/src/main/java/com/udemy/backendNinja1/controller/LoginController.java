package com.udemy.backendNinja1.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.udemy.backendNinja1.constant.ViewConstant;

@Controller
public class LoginController {
	//Creamos la Variable LOG
	private static final Log LOG = LogFactory.getLog(LoginController.class);
	
	/*@GetMapping("/")
	public String redirectToLogin() {
		LOG.info("METHOD: redirectToLogin()"); //Añadimos el LOG//
		return "redirect:/login";
	}*/
	
	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout",required=false)String logout) {
		LOG.info("METHOD: showLoginForm() -- PARAMS: error=" + error +", logout:"+logout ); //Añadimos el LOG//
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		/*model.addAttribute("userCredentials", new UserCredential());*/
		LOG.info("Returning to login view"); //Añadimos el LOG//
		return ViewConstant.LOGIN; //Desde la Clase ViewConstant//
	}
	
	@GetMapping({"/loginsuccess" , "/"})
	public String loginCheck() {
		LOG.info("METHOD: loginCheck()"); //Añadimos el LOG//
		LOG.info("Returning to contacts view");
		return "redirect:/contacts/showcontacts"; //Desde la Clase ContactController//
	}
}
