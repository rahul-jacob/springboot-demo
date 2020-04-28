package com.xyz.spring.raul.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"EN","default"})
@Service("greet")
public class HindiGreetingServcie implements GreetingService {

	@Override
	public String doGreet() {
		return "Namaskar ji...";
	}

}
