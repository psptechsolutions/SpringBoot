package com.psp.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

//This concept is used to find/search class having @Component (and it types) by spring container
@ComponentScan
public class RunnerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunnerdemoApplication.class, args);
	}
	
//	@Bean
//    public ApplicationRunner applicationRunner() {
//        return new ApplicationRunner() {
//            @Override
//            public void run(ApplicationArguments args) throws Exception {
//                System.out.println("Connecting TO Database");
//            }
//        };
//    }

}
