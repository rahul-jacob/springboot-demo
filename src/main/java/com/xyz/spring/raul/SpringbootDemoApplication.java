package com.xyz.spring.raul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xyz.spring.raul.controllers.MyController;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
		//By default every bean will be created in the context will have the name of the class name
		//with the first letter in lower case so MyController in the context will be myController
		MyController mycontroller = (MyController) ctx.getBean("myController");
		String greeting = mycontroller.sayHello();
		System.out.println(greeting);
	}

}
