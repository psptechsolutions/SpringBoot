package com.example.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping(value = "/welcome")
	public String welcome() {
		String name = null;
		//name.length();
		int a=10/0;
		return "welcome";

	}

//	@ExceptionHandler(value = NullPointerException.class)
//	public String handleNullPointerException() {
//
//		String msg = "Some Problem occured, please try later";
//		return msg;
//
//	}
//	
//	@ExceptionHandler(value = ArithmeticException.class)
//	public String handleArithmeticException() {
//
//		String msg = "Got some Arithematic Exception";
//		return msg;
//
//	}
}
