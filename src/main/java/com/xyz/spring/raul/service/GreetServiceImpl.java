package com.xyz.spring.raul.service;

import org.springframework.stereotype.Service;

@Service
public class GreetServiceImpl implements GreetService{

	@Override
	public String sayHello() {
		return "Hai There, How do you do?";
	}

}
