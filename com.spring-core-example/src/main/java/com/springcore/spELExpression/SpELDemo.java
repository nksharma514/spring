package com.springcore.spELExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpELDemo {
	
	@Value("F62")
	private String name;
	
	@Value("Samsung")
	private String brand;
	
	
	@Value("#{11+22+33}")			//this SpEL Expression using normal math
	private String test;
	
	@Value("#{ T(java.lang.Math).sqrt(144) }")			//this SpEL Expression using sqrt class  
	private double square;
	
	@Value("#{ T(java.lang.Math).E }")			//this SpEL Expression using static variable value of e  
	private double e;
	
	@Value("#{ T(java.lang.Math).PI }")			//this SpEL Expression using static variable value of Pi  
	private double pi;
	
		
	@Value("#{ new java.lang.String('Narendra Sharma') }")			//this SpEL Expression using to get object  
	private String myName ;
	

//	mobile getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
//	SpEL Expression getter and setter
	public void setTest(String test) {
		this.test = test;
	}
	
	public String getTest() {
		return test;
	}	

	public double getSquare() {
		return square;
	}
	public void setSquare(double square) {
		this.square = square;
	}
	
	
//	SpEL Expression getter and setter for static variable value
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	
//	SpEL Expression getter and setter for getting object
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	
	
	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + "]" +
			   " MethodTest [test= "+ test +", square="+ square +", e="+ e +", pi="+ pi +"]" +
			   " ObjectTest [myName= "+ myName +"]";
	}
	
	

}
