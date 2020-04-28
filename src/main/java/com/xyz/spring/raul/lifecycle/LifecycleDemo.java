package com.xyz.spring.raul.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifecycleDemo
		implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifecycleDemo() {
		super();
		System.out.println("## I am in LifecycleDemo Constructor");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## ApplicationContext has been set");
	}
	
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## BeanFactory has been set");
	}
	@Override
	public void setBeanName(String name) {
		System.out.println("## BeanName has been set "+name);
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("## Lifecycle has been terminated");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## Lifecycle has its property set");
	}	
	@PostConstruct
	public void postconstruct() {
		System.out.println("## The postconstruct annotated method has been called");
	}

	@PostConstruct
	public void predestroy() {
		System.out.println("## The predestroy annotated method has been called");
	}

	public void beforeInit() {
		System.out.println("## The beforeInit method has been called from Bean Post Processor");		
	}

	public void afterInit() {
		System.out.println("## The afterInit method has been called from Bean Post Processor");		
	}

}
