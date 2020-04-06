package com.xyz.spring.raul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xyz.spring.raul.controller.ConstructorInjectionController;
import com.xyz.spring.raul.controller.PropertyInjectionController;
import com.xyz.spring.raul.controller.SetterInjectionController;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
		
		System.out.println("/**************************** Dependency Injection with Primary Annotation *************************************/");
		System.out.println("-- Annotation Primary Demo --Beg");
		System.out.println("");
		System.out.println("Properity Injection using @Primary for Primary Greeting Service");
		PropertyInjectionController controller = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
		System.out.println(controller.greet());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("Setter Injection using @Qualifier for Spanish Greeting Service");
		SetterInjectionController setterController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterController.greet());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("Properity Injection using @Primary for Primary Greeting Service");
		ConstructorInjectionController constructorController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorController.greet());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("-- Annotation Primary Demo --End");
	}

}
