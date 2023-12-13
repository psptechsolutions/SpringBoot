package com.example.service;

import org.springframework.stereotype.Service;

import com.example.exception.EmployeeNameNotFoundException;
import com.example.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public String findById(String employeeId) {
		if (employeeId.equals("A1000")) {
			return "Test user";
		} else {
			throw new EmployeeNotFoundException("Employee Not found for this id");
		}

	}
	
	
	@Override
	public String findByName(String name) {
		if (name.equals("Test")) {
			return "Empployee Name found";
		} else {
			throw new EmployeeNameNotFoundException("Employee Details Not found for this id");
		}

	}


}
