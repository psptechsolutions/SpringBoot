package com.example.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class RestControllerAdviceExceptionHandler {

	
	@ExceptionHandler(value = EmployeeNameNotFoundException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ApiError handleEmployeeNameNotFoundException(Exception ex, WebRequest request) {

//		ApiError apiError = new ApiError();
//		apiError.setErroMsg("Employee detials Not found");
//		apiError.setDate(new Date());
//		apiError.setErrorCode(400);
//		apiError.setErrorDetails("This is Rest Controller Advice.No employee Found for this name. Please give correct name");
//		return new ResponseEntity<ApiError>(apiError, HttpStatus.BAD_REQUEST);

		ApiError apiError = new ApiError();
		apiError.setErroMsg("Employee detials Not found");
		apiError.setDate(new Date());
		//apiError.setErrorCode(400);

		return apiError;

	}
}
