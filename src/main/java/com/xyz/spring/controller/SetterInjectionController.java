package com.xyz.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xyz.spring.service.GreetingService;

@Controller
public class SetterInjectionController {
	
	private GreetingService greetingService;
	
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String greet() {
		return greetingService.greet();
	}
}
