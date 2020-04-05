package com.xyz.spring.raul.controllers;

import com.xyz.spring.raul.service.GreetingService;
import com.xyz.spring.raul.service.GreetingsServiceImpl;

public class SetterInjectionController {
	
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String greet() {
		greetingService = new GreetingsServiceImpl();
		return greetingService.sayGreetings();
	}
	
	
}
