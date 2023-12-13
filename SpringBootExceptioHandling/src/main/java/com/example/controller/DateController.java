package com.example.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateController {

	@RequestMapping(value = "/date")
	public LocalDateTime welcome() {
		String name = null;
		name.length();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return now;

	}
	
	
//	@ExceptionHandler(value = NullPointerException.class)
//	public String handleNullPointerException() {
//
//		String msg = "Some Problem occured, please try later";
//		return msg;
//
//	}
}
