package com.xyz.spring.raul.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.xyz.spring.raul.service.GreetingsServiceImpl;

public class SetterInjectionControllerTest {
	
	private SetterInjectionController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new SetterInjectionController();
		controller.setGreetingService(new GreetingsServiceImpl());
	}
	
	@Test
	public void getGreeting() {
		System.out.println(controller.greet());
	}
}
