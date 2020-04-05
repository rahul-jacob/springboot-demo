package com.xyz.spring.raul.controllers;

import com.xyz.spring.raul.service.GreetingService;

public class SetterController {
	
	private GreetingService greetService;
	
	public void setGreetService(GreetingService greetService) {
		this.greetService = greetService;
	}

	public String greet() {
		return greetService.sayGreetings();
	}

}
