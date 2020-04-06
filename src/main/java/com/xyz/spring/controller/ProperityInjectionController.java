package com.xyz.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xyz.spring.service.GreetingService;

@Controller
public class ProperityInjectionController {
	
	@Autowired
	private GreetingService greetingService;
	
	public String greet() {
		return greetingService.greet();
	}
}
