package com.springcore.annotation.method1;

import org.springframework.stereotype.Component;

@Component("myStudent")
public class Student {
	
	public void name() {
		System.out.println("My name is Narendra Sharma.");
	}

}
