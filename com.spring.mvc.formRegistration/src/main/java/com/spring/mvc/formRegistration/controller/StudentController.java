package com.spring.mvc.formRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.formRegistration.model.User;
import com.spring.mvc.formRegistration.service.StudentService;

@Controller
public class StudentController {

	
	@Autowired
	private StudentService studentService; 
	
	

//	@RequestMapping("/student")
//	public String studentController() {		
//		System.out.println("Student Controller");
//		return "student";
//	}
	
	
	@RequestMapping("/student")
	public String studentController(Model mod) {		
		
		mod.addAttribute("Header", "Java Spring MVC Tutorial");
		mod.addAttribute("Description", "Code With Narendra Sharma");
		
		return "student";
	}
	


	
//	/ can be removed from below line
	@RequestMapping(value = "/processform", method = RequestMethod.POST)
	public String formController(@ModelAttribute User user,  Model model){		
		System.out.println(user);
		
		model.addAttribute("Header", "Java Spring MVC Tutorial");
		model.addAttribute("Description", "Code With Narendra Sharma");
		
		
		int createdStudent = this.studentService.createStudent(user);
		
		model.addAttribute("msg", "Student User is created successfully with id :" + createdStudent);
		
		return "success";
	}
	
	
/*
	 
	 //	/ can be removed from below line
	@RequestMapping(value = "/processform", method = RequestMethod.POST)
	public String formController
			(
				@RequestParam("email") String studentEmail,
				@RequestParam("name") String StudentName,
				@RequestParam("password") String StudentPassword, 
				Model model
			){
		
		System.out.println("User Email is " + studentEmail);
		System.out.println("User Name is " + StudentName);
		System.out.println("User Password is " + StudentPassword);
		
		model.addAttribute("email1", studentEmail);
		model.addAttribute("name1", StudentName);
		model.addAttribute("pass", StudentPassword);
		
		return "success";
	}
 
*/
	
	

}
