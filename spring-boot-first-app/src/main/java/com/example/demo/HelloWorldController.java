package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
//	http://localhost:8080/hello
	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

}
