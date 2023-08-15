package com.springcore.annotation.method2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student =  context.getBean("getStudent", Student.class);
		student.getFirstName();
		student.getLastName();
	}

}
