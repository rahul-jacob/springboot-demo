package com.xyz.spring.raul.controllers;

import com.xyz.spring.raul.service.GreetingService;
import com.xyz.spring.raul.service.GreetingsServiceImpl;

public class PropertyInjectionController {
	
	public GreetingService greetingService;
	
	public String greet() {
		greetingService = new GreetingsServiceImpl();
		return greetingService.sayGreetings();
	}
}
