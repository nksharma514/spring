package com.spring.mvc.formRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.formRegistration.dao.StudentDao;
import com.spring.mvc.formRegistration.model.User;

@Service
public class StudentService {
	
	
	@Autowired
	private StudentDao studentDao;
	
	public int createStudent(User user) {
		return this.studentDao.saveStudent(user);
	}
	

}
