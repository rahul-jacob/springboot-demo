package com.xyz.spring.raul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xyz.spring.raul.service.GreetingService;

@Controller
public class ProperityInjectionController {
	
	@Autowired //Injecting Via Property we used @Autowired annotation at the property level
	public GreetingService greetingService;
	
	public String greeting() {
		return greetingService.sayGreeting();
	}

}
