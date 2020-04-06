package com.xyz.spring.raul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.xyz.spring.controller.ProperityInjectionController;

@SpringBootApplication
@ComponentScan("org.xyz.spring.raul")
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
		
		System.out.println("/**************************** Dependency Injection with Qualifier Annotation *************************************/");
		System.out.println("-- Beg");
		ProperityInjectionController ctrl = (ProperityInjectionController) ctx.getBean("properityInjectionController");
		System.out.println(ctrl.greet());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("-- End");
	}

}
