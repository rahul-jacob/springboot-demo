package com.xyz.spring.raul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xyz.spring.raul.controller.ConstructorInjectionController;
import com.xyz.spring.raul.controller.GreetingController;
import com.xyz.spring.raul.controller.ProperityInjectionController;
import com.xyz.spring.raul.controller.SetterInjectionController;
import com.xyz.spring.raul.service.GreetingServiceImpl;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
		System.out.println("-- Beg");
		System.out.println("");
		System.out.println("/**************************** Normal Bean Instantiation with out Dependency Injection *************************************/");
		GreetingController controller = new GreetingController();
		controller.greetingService = new GreetingServiceImpl();
		System.out.println("Invoking MyController via context "+controller.greeting());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		
		System.out.println("/**************************** Properity Dependency Injection *************************************/");
		ProperityInjectionController properityController = (ProperityInjectionController) ctx.getBean("properityInjectionController");
		System.out.println("Invoking PropertyInjectionController via context "+properityController.greeting());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");

		System.out.println("/**************************** Setter Dependency Injection *************************************/");
		SetterInjectionController setterController = (SetterInjectionController) ctx.getBean("setterInjectionController");
		System.out.println("Invoking SetterInjectionController via context "+setterController.greeting());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");

		System.out.println("/**************************** Constructor Dependency Injection *************************************/");
		ConstructorInjectionController constructorController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
		System.out.println("Invoking ConstructorInjectionController via context "+constructorController.greeting());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		
		System.out.println("-- End");
	}

}

/* Error-1
	Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'greetingController' available
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBeanDefinition(DefaultListableBeanFactory.java:686)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getMergedLocalBeanDefinition(AbstractBeanFactory.java:1205)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:292)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1085)
	at com.xyz.spring.raul.SpringbootDemoApplication.main(SpringbootDemoApplication.java:15)
=>
	Add @Controller to Fix the issue in GreetingController class.
*/

/* Error-2
	Exception in thread "main" java.lang.NullPointerException
	at com.xyz.spring.raul.controller.GreetingController.greeting(GreetingController.java:13)
	at com.xyz.spring.raul.SpringbootDemoApplication.main(SpringbootDemoApplication.java:16)
=>
	Add @Autowired to Fix the issue in GreetingController class.
*/

/* Error-3
	
	Description:

	Field greetingService in com.xyz.spring.raul.controller.GreetingController required a bean of type 'com.xyz.spring.raul.service.GreetingService' that could not be found.
	
	
	Action:
	
	Consider defining a bean of type 'com.xyz.spring.raul.service.GreetingService' in your configuration.
=>
	Add @Service to Fix the issue in the GreetingServiceImpl class.
*/