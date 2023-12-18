package com.psp.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootConfigPropApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(SpringBootConfigPropApplication.class, args);
		Object ob1 = ac.getBean("productInfo");
		//Object ob2 = ac.getBean("dbConn");
		System.out.println(ob1);
		//System.out.println(ob2);
	}

}
