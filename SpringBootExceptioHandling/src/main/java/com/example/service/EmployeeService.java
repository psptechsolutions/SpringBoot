package com.example.service;

import java.util.List;

public interface EmployeeService {
	public String findById(String employeeId);

	String findByName(String name);

	public List<String> showAllEmployees();
}
