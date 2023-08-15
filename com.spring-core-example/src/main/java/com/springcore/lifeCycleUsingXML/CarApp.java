package com.springcore.lifeCycleUsingXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifeCycleUsingXML/carConfig.xml");
		Car c = (Car) context.getBean("car");
		
		System.out.println(c);
		
//		Registering shutdown hook using AbstractApplicationContext to call destroy method
		context.registerShutdownHook();
		
	}

}
