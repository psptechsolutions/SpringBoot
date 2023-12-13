package com.example.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class RestExceptionHandler {

	@ExceptionHandler(value = EmployeeNotFoundException.class)
	public ResponseEntity handleEmployeeNotFoundException1() {

		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

	}

	@ExceptionHandler(value = EmployeeNameNotFoundException.class)
	public ResponseEntity<ApiError> handleEmployeeNameNotFoundException() {

		ApiError apiError = new ApiError();
		apiError.setErroMsg("Employee detials Not found");
		apiError.setDate(new Date());
		apiError.setErrorCode(400);
		apiError.setErrorDetails("No employee Found for this name. Please give correct name");
		return new ResponseEntity<ApiError>(apiError, HttpStatus.BAD_REQUEST);

	}
}
