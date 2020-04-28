package com.xyz.spring.raul.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("greet")
@Profile("IN")
public class SpanishGreetingService implements GreetingService {

	@Override
	public String doGreet() {
		return "Hola Mundo...";
	}
}
