package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public String getEmployeeByName(@RequestParam("name") String employeeId) {

		String name = employeeService.findByName(employeeId);
		return name;

	}
	

}
