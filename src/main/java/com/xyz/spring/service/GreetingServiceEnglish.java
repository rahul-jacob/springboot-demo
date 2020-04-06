package com.xyz.spring.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceEnglish implements GreetingService {

	@Override
	public String greet() {
		return "Hai there, How are you";
	}

}
