package com.xyz.spring.raul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.xyz.spring.raul.controller.MyController;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());
	}

}
//Have a look at LifecycleDemo.java class. which contains some lifecycle method
//Also CustomBeanPostProcessor class implemented if we need to do post processing once a bean is created by spring context.
/*
Spring Bean Lifecycle
---------------------
1. Instantiate
2. Populate Properties
3. Call setBeanName of BeanNameAware
4. Call setBeanFactory of BeanNameAware
5. Call setApplicationContext of ApplicationContextAware
6. Preinitialization(Bean PostProcessors)
7. afterPropertiesSet of InitializingBeans
8. Custom init Method
9. Post Initialization(BeanPostProcessors)
After these 9 steps our bean is Ready to Use.

Now following are the steps that happen while destroying a bean or when the container is shutdown
1. Disposable Bean's destroy()
2. Call customer destroy method
After these 2 steps the bean is destroyed or terminated.

Now we will look at the Callback Interfaces
Spring has 2 interfaces you can implement for callback events
1. InitializingBean.afterPropertiesSet() - called after properties are set.
2. DisposableBean.destroy() - called during bean destruction in shutdown.

Now we will look at the Lifecycle Annotations
Spring has 2 annotations you can use to hook into the bean life cycle
1. @PostConstruct - @PostConstruct annotated method will be called after the bean has been constructed, but before its returned to the requesting object.
2. @PreDestroy - @PreDestroy is called just before the bean is destroyed by the container.

Now we will look at Bean Post Processors
Gives you a means to tap into the Spring context life cycle and interact with the beans as they are processed
Implement interface BeanPostProcessor
1. postProcessBeforeInitialization - Called before bean initialization method
2. postProcessAFterInitialization - Called after bean initialization

Next we have Aware Interfaces
 - Spring has over 14 Aware Interfaces
 - These are used to access the Spring Framework infrastructure
 - These are largely used within the framework
 - Rarely used by Spring developers

*/
