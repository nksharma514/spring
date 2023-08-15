package com.springcore.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.aop.service.PaymentService;

public class App 
{
    public static void main( String[] args ){
    	
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/aop/config.xml");
    	PaymentService service = context.getBean("payment", PaymentService.class);
        
      //authentication, print:payment started
    	service.makePayment(); 
        
    	System.out.println("****************************************************");
    	
//    	service.makePayment1(5000);
    	
//    	
    }
}
