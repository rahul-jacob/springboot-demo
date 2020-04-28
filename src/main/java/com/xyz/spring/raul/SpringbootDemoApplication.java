package com.xyz.spring.raul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xyz.spring.raul.controller.GreetingController;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
		GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
		System.out.println(greetingController.sayGreeting());		
	}

}
/*
Description:

Parameter 0 of constructor in com.xyz.spring.raul.controller.GreetingController required a single bean, but 2 were found:
	- hindiGreetingServcie: defined in file [C:\Users\1223204\Documents\TCS_Confidential\springboot-demo\target\classes\com\xyz\spring\raul\service\HindiGreetingServcie.class]
	- spanishGreetingService: defined in file [C:\Users\1223204\Documents\TCS_Confidential\springboot-demo\target\classes\com\xyz\spring\raul\service\SpanishGreetingService.class]


Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
=> but what we are doing here is provide for both the HindiGreetingServcie and SpanishGreetingService is to provide a @Profile annotation and dertermine while starting
the application which one to start up either hindhi or spanish. we put 2 profiles in HindiService and SpanishService then specify the one to load in application.properties.
spring.profiles.active=ES so here only the profile ES will be loaded. We have defined Profile annotation in to Services in hindi and spanish but now the profile with EN gets
loaded which is spanish. and in hindi service we gave profile as IN hence the hindi service is discarded. Hence we avoided the above error.

But we also have another approach of profile called default. Its possible to accept more than one Profile value for a class. by comma separate i.e @Profile({"EN","default"})
if we are not configuring any active profiles in application.properties then the default profile will be loaded. Here in the eg for HindiGreetingServcie we gave the default
profile and for SpanishGreetingService we gave ES Profile and we didn't configure any active profile. Then automatically the default Greeting which is the HindiGreetingService
got injected to GreetingService. And since the SpanishGreetingService is of ES profile it got ignored. 
*/
