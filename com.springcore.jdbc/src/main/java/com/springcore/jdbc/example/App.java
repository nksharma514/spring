package com.springcore.jdbc.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/jdbc/example/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println("table is inserted...");
		
		
		String query = "insert into student(id, name, city) values(?, ?, ?)";
		
		int result = template.update(query, 555, "Pankaj", "Kumar");
		System.out.println("number of records inserted: " + result);
		
		
		
	}
}
