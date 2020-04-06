package com.xyz.spring.raul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xyz.spring.raul.service.GreetingService;

@Controller
public class ConstructorInjectionController {
	@Autowired
	private GreetingService greetingService;
	
	public ConstructorInjectionController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String greet() {
		return greetingService.greet();
	}
}
