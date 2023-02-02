package com.korea1.exception;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import lombok.extern.log4j.Log4j;

@ControllerAdvice
@Log4j
public class GlobalCatcher {
	
	@ExceptionHandler(Exception.class)
	public String ALLEx(Exception ex,Model model) {
		log.info("global Arithmetic Ex..");
		model.addAttribute("ex",ex);
		return "error"; 
	}

}
