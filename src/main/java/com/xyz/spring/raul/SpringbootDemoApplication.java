package com.xyz.spring.raul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xyz.spring.raul.controller.ConstructorInjectionController;
import com.xyz.spring.raul.controller.ProperityInjectionController;
import com.xyz.spring.raul.controller.SetterInjectionController;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
		
		System.out.println("/**************************** Dependency Injection with Qualifier Annotation *************************************/");
		System.out.println("-- Annotation Qualifier Demo --Beg");
		System.out.println("");
		System.out.println("Properity Injection using @Qualifier for English Greeting Service");
		ProperityInjectionController controller = (ProperityInjectionController) ctx.getBean("properityInjectionController");
		System.out.println(controller.greet());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("Setter Injection using @Qualifier for Frency Greeting Service");
		SetterInjectionController setterController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println(setterController.greet());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("Constructor Injection using @Qualifier for Spanish Greeting Service");
		ConstructorInjectionController constructorController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println(constructorController.greet());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("-- Annotation Qualifier Demo --End");
	}
/*
Description:

Parameter 0 of constructor in com.xyz.spring.raul.controller.ConstructorInjectionController required a single bean, but 3 were found:
	- greetingServiceEnglish: defined in file [C:\Users\1223204\Documents\TCS_Confidential\springboot-demo\target\classes\com\xyz\spring\raul\service\GreetingServiceEnglish.class]
	- greetingServiceFrench: defined in file [C:\Users\1223204\Documents\TCS_Confidential\springboot-demo\target\classes\com\xyz\spring\raul\service\GreetingServiceFrench.class]
	- greetingServiceSpanish: defined in file [C:\Users\1223204\Documents\TCS_Confidential\springboot-demo\target\classes\com\xyz\spring\raul\service\GreetingServiceSpanish.class]


Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed 

=>

User the @Qualifier Annotation for Property, Setter and Constructor 

*/
}
