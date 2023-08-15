package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/reference/refConfig.xml");
		A a = (A) context.getBean("a-ref");

		System.out.println(a.getX());

		System.out.println(a.getObj().getY());

		System.out.println(a);

	}

}
