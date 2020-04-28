package com.xyz.spring.raul.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.xyz.spring.raul.service.GreetService;

@Controller
public class MyController {
	
	@Autowired
	GreetService greet;
	
	public String sayHello() {
		return greet.sayHello();
	}

}
