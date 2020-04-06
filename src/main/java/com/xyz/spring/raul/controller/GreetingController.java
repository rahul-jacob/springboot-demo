package com.xyz.spring.raul.controller;

import com.xyz.spring.raul.service.GreetingService;

public class GreetingController {
	
	
	public GreetingService greetingService;
	
	public String greeting() {
		return greetingService.sayGreeting();
	}
}

