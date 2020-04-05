package com.xyz.spring.raul.controllers;

import com.xyz.spring.raul.service.GreetingService;

public class SetterInjectionController {
	
	private GreetingService greetService;
	
	public void setGreetingService(GreetingService greetService) {
		this.greetService = greetService;
	}

	public String greet() {
		return greetService.sayGreetings();
	}

}
