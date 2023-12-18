package com.psp.profile.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@Value("${env}")
	private String env;

	@GetMapping("/hello")
	public String sayHello() {
		return env;
	}

}
