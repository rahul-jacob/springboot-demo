package com.xyz.spring.raul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.xyz.spring.raul.service.GreetingService;
@Controller
public class SetterInjectionController {
	@Qualifier("greetingServiceSpanish")
	@Autowired
	private GreetingService greetingService;
	
	public String greet() {
		return greetingService.greet();
	}
}
