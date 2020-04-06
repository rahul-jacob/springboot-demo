package com.xyz.spring.raul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xyz.spring.raul.service.GreetingService;

@Controller
public class PropertyInjectionController {
	
	@Autowired
	private GreetingService greetingService;
	
	public String greet() {
		return greetingService.greet();
	}

}
