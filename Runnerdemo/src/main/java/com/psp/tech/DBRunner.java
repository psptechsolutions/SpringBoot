package com.psp.tech;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DBRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("My DB Runner");

	}
}
