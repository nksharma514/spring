package com.example.demo.car;

import org.springframework.stereotype.Component;

import com.example.demo.intface.Car;

//@Component
public class Swift implements Car {

	public String specs() {		
		return "Hatchbace from Suzuki";
	}

}
