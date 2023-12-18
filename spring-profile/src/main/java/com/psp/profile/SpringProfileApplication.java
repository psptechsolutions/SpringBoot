package com.psp.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileApplication.class, args);
		
		System.out.println("Program Arguments:");
		for (String arg : args) {
			System.out.println("\t" + arg);
		}
		
		System.out.println("System Properties from VM Arguments");
	
		System.out.println("Value:" + System.getProperty("spring.profiles.active"));
	
	}

}
