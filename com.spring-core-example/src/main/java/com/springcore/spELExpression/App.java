package com.springcore.spELExpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class App {

	public static void main(String[] args) {
		
		
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spELExpression/config.xml");
	SpELDemo mob = context.getBean("spELDemo", SpELDemo.class);	
	System.out.println(mob);
	
	
//	it's provide many classes example
	
	SpelExpressionParser temp =  new SpelExpressionParser();
	Expression expression = temp.parseExpression("55+66+48+36");
	System.out.println(expression.getValue());

	}

}
