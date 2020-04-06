package com.xyz.spring.raul.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hai there Spring Framework Whishes You A Good Day";
	}

}
