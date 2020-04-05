package com.xyz.spring.raul.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.xyz.spring.raul.service.GreetingsServiceImpl;

public class SetterInjectionControllerTest {
	
	private SetterController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new SetterController();
		controller.setGreetService(new GreetingsServiceImpl());
	}
	
	@Test
	public void getGreeting() {
		System.out.println(controller.greet());
	}
}
