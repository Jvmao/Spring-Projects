package com.project1.SpringApp1.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class errorsController {
		//Variable
		public static final String ERROR500_VIEW = "error/500";
		
		@ExceptionHandler(Exception.class)
		public String showInternalServerError() {
			return ERROR500_VIEW;
		}
}
