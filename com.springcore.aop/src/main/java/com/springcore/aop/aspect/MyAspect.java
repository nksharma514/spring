package com.springcore.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {	
	
//	@Before(" execution (* com.springcore.aop.service.PaymentServiceImpl.* )")						// this will execute all method of class PaymentServiceImpl
//	@Before(" execution (* com.springcore.aop.service.PaymentServiceImpl.makePayment(..) )")		// if any parameter then use .. two times dot for parameterized method
	@Before(" execution (* com.springcore.aop.service.PaymentServiceImpl.makePayment() )")			// here * means any return type, this may be int String any type of return type
	public void beforePayment() {
		System.out.println("Payment started...");
	}	
	
//	@After(" execution (* com.springcore.aop.service.PaymentServiceImpl.* )")
//	@After(" execution(* com.springcore.aop.service.PaymentServiceImpl.makePayment(..) )")
	@After(" execution(* com.springcore.aop.service.PaymentServiceImpl.makePayment() )")
	public void afterPayment() {
		System.out.println("Payment done...");
	}
	
	
	
//	With Parameterized constructor	

//	@Before(" execution (* com.springcore.aop.service.PaymentServiceImpl.makePayment(..) )")		// if any parameter then use .. two times dot for parameterized method
//	public void beforePayment() {
//		System.out.println("Payment started...");
//	}
//		
//	@After(" execution(* com.springcore.aop.service.PaymentServiceImpl.makePayment(..) )")
//	public void afterPayment() {
//		System.out.println("Payment done...");
//	}
	
	
	
	

	
	
	
	
	

}
