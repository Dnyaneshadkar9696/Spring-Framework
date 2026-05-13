package com.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Myconfig;
import com.entity.Person;

import org.springframework.context.ApplicationContext;


public class Controller {
	
	public static void main(String[] args) {
		
		// calling functionality 
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
		
		Person p = context.getBean(Person.class);
		
		p.rechareGoingToEnd();
		p.rechargeEnded();
		
		
		
		
		
	}

}
