package com.simplilearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Phase3May142022Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Phase3May142022Application.class, args);
	
		context.start();
	}

}
