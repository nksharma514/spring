package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
//	http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Narendra", "Sharma");
	}
	
//	http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> student = new ArrayList<>();
		
		student.add(new Student("Raju","Kumar"));
		student.add(new Student("Ravi","Chander"));
		student.add(new Student("Kissu","Mohan"));
		student.add(new Student("Ram","Sharma"));
		student.add(new Student("Suman","Kumari"));
		
		return student;
	}

}
