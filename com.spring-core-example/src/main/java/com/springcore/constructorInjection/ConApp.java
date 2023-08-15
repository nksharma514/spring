package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConApp {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructorInjection/conConfig.xml");
	Person person = (Person) context.getBean("person");
		
	System.out.println(person);

	}

}
