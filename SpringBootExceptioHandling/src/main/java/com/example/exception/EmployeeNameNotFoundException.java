package com.example.exception;

public class EmployeeNameNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public EmployeeNameNotFoundException(String msg) {
		super(msg);
	}
}
