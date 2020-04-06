package com.xyz.spring.raul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.xyz.spring.raul.service.GreetingService;

@Controller
public class ConstructorInjectionController {
	
	private GreetingService greetingService;
	
	@Autowired
/*
	When doing constructor injection @Qualifier can only be specified at paramerter list. It cannot be specified
	below or above @Autowired annotation
 */
	public ConstructorInjectionController(@Qualifier("greetingServiceSpanish") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String greet() {
		return greetingService.greet();
	}
	
	
}
