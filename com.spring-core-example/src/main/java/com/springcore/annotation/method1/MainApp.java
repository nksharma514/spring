package com.springcore.annotation.method1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
	ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	Student stud = context.getBean("myStudent", Student.class);
	stud.name();

	
	}

}
