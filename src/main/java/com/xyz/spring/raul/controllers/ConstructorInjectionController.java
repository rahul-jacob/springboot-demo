package com.xyz.spring.raul.controllers;

import com.xyz.spring.raul.service.GreetingService;
import com.xyz.spring.raul.service.GreetingsServiceImpl;

public class ConstructorInjectionController {

	private GreetingService greetingService;

	public ConstructorInjectionController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	public String greet() {
		return greetingService.sayGreetings();
	}
}
