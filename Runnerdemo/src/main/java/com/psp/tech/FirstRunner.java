package com.psp.tech;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class FirstRunner implements CommandLineRunner,Ordered  {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("My First Runner");
		
	}

	@Override
	public int getOrder() {
	
		return  1;
	}

}
