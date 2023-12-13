package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = NullPointerException.class)
	public String handleNullPointerException() {

		String msg = "Some Problem occured, please try later";
		return msg;

	}
	
	@ExceptionHandler(value = ArithmeticException.class)
	public String handleArithmeticException() {

		String msg = "Got some Arithematic Exception again";
		return msg;

	}
//	@ExceptionHandler(value = EmployeeNotFoundException.class)
//	public ResponseEntity handleEmployeeNotFoundException() {
//		
//		
//		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//
//	}


}
