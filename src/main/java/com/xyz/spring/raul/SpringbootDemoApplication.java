package com.xyz.spring.raul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		System.out.println("Starting in SpringbootDemoApplication run method...");
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
