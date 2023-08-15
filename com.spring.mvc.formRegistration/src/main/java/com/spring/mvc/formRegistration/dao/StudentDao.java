package com.spring.mvc.formRegistration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.formRegistration.model.User;

@Repository
public class StudentDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int saveStudent(User user) {
		int id = (Integer)this.hibernateTemplate.save(user);
		return id;
	}
	

}
