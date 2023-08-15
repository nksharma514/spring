package com.springcore.annotation.method2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	public LastName getName() {
		return new LastName();
	}
	
	@Bean
	public Student getStudent() {	
		Student stud = new Student(getName());
		return stud;
	}

}
