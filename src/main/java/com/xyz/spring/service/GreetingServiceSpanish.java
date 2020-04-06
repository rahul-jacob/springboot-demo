package com.xyz.spring.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceSpanish implements GreetingService {

	@Override
	public String greet() {
		return "Es tuyo, Cómo estás";
	}

}
