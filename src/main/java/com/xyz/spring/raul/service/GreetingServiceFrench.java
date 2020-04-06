package com.xyz.spring.raul.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceFrench implements GreetingService {

	@Override
	public String greet() {
		return "Est le vôtre, Comment ça va";
	}

}
