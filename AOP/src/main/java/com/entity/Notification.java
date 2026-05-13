package com.entity;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class Notification {
	
//	@Before("execution(* com.entity.Person.rechareGoingToEnd(..))")
//	public void rechargeGoingToEnd() {
//		System.out.println("recharge Ending..please recharge soon");
//	}
//	
//	@After("execution(* com.entity.Person.rechargeEnded(..))")
//	public void rechargeEnded() {
//		System.out.println("Recharge ended..please recharge soon");
//	}
	
	
	
	@Around("execution(* com.entity.Person.rechareGoingToEnd(..))")
	public void rechargeGoingToEnd(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("recharge Ending..please recharge soon");
		pjp.proceed();
		
		System.out.println("Recharge ended...");
	}

}
