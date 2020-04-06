package com.xyz.spring.raul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.xyz.spring.raul.service.GreetingService;

@Controller
public class SetterInjectionController {
	
	private GreetingService greetingService;
/*
	 You can mention the @Qualifier either below or above the @Autowired annotation or you can define the Qualifier
	 annotation in the parameter list
*/
	//Qualifier
	@Autowired
	public void setGreetingService(@Qualifier("greetingServiceFrench") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String greet() {
		return greetingService.greet();
	}
}
