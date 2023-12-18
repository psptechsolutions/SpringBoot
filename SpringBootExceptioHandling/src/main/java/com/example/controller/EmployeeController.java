package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/findById")
	public String getEmployeeId(@RequestParam("employeeId") String employeeId) {

		String name = employeeService.findById(employeeId);
		return name;

	}
	@GetMapping(value = "/findByName")
	public String getEmployeeByName(@RequestParam String employeeId) {

		String name = employeeService.findByName(employeeId);
		return name;

	}
	
	
	//showAllEmployees
	
	@GetMapping(value = "/showAllEmployees")
	public List<String> showAllEmployees() {

		List<String>  namesList = employeeService.showAllEmployees();
		return namesList;

	}
	

	
	
}
