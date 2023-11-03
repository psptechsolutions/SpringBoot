package com.psp.tech;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RestControllerTest {

	@GetMapping("/hello")
	public String testhello() {
		System.out.println("Spring Boot Tomcat Web app is working");
		return "Spring Boot  Demo using external Tomcat Web app is working";

	}
}
