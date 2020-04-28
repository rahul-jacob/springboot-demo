package com.xyz.spring.raul.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("greet")
public class SpanishGreetingService implements GreetingService {

	@Override
	public String doGreet() {
		return "Hola Mundo...";
	}
}
