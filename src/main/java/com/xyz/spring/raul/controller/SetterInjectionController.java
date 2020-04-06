package com.xyz.spring.raul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xyz.spring.raul.service.GreetingService;

@Controller
public class SetterInjectionController {

	public GreetingService greetingService;
	
	@Autowired //Injecting Via Setter we used @Autowired annotation at the setter level
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String greeting() {
		return greetingService.sayGreeting();
	}


}
