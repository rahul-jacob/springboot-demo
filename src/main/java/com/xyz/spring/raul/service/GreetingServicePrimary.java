package com.xyz.spring.raul.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class GreetingServicePrimary implements GreetingService {

	@Override
	public String greet() {
		return "In greet() from Greeting Service Primary Service";
	}

}
