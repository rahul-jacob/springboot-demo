package com.xyz.spring.raul.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.xyz.spring.raul.service.GreetingsServiceImpl;

public class PropertyInjectionControllerTest {
	
	private PropertyInjectionController propertyController;
	
	@BeforeEach
	public void setUp() {
		propertyController = new PropertyInjectionController();
		propertyController.greetingService = new GreetingsServiceImpl();//Property Injection
	}
	
	@Test
	public void greet() {
		System.out.println(propertyController.greet());
	}
}
