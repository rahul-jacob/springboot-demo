package com.xyz.spring.raul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xyz.spring.raul.service.GreetingService;

@Controller
public class ConstructorInjectionController {
	
	private GreetingService greetingService;

	@Autowired /*Injecting Via Constructor we used @Autowired annotation at the constructor level and the keyword is 
	             optional when ever we are doing a constructor injection*/
	public ConstructorInjectionController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String greeting() {
		return greetingService.sayGreeting();
	}
	
}
