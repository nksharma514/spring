package com.example.demo.car;

import org.springframework.stereotype.Component;

import com.example.demo.intface.Car;

@Component
public class Corolla implements Car {

	public String specs() {		
		return "Sedan from Toyota";
	}

}
