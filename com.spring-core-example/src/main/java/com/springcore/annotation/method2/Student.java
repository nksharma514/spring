package com.springcore.annotation.method2;


public class Student {
	
//	here doing dependency injection to get LastName  
	private LastName lastName;	
	
//	constructor using field
	public Student(LastName lastName) {
		super();
		this.lastName = lastName;
	}
	
//	getter setter
	public LastName getLastName() {
		return lastName;
	}
	public void setLastName(LastName lastName) {
		this.lastName = lastName;
	}
	
	
//	normal method to get FirstName
	public void getFirstName() {		
		System.out.println("My FirstName is Shivansh ");
		
		this.lastName.getlastName();
	}

}
