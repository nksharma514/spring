package com.springcore.lifeCycleUsingXML;

public class Car {
	
	private double price;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}
	
	
//	initializing or starting point of bean life cycle
	public void init() {
		System.out.println("inside init method");
	}
	
//	destroying or destroy point of bean life cycle
	public void destroy() {
		System.out.println("inside destroy method");
	}

}
