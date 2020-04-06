package com.xyz.spring.raul.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceArabic implements GreetingService {

	@Override
	public String greet() {
		return "In greet() from Greeting Service Arabic Service";
	}

}
