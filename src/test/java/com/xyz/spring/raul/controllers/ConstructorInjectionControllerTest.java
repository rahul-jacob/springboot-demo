package com.xyz.spring.raul.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.xyz.spring.raul.service.GreetingsServiceImpl;

public class ConstructorInjectionControllerTest {
	
	private ConstructorInjectionController controller;
	
	@BeforeEach
	public void setUp() {
		controller = new ConstructorInjectionController(new GreetingsServiceImpl());
	}
	
	@Test
	public void greet() {
		System.out.println(controller.greet());
	}
	
}
