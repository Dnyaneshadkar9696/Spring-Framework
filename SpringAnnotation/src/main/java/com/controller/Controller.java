package com.controller;


import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Myconfig;
import com.entity.Employee;
public class Controller {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
		
		
		Employee emp = context.getBean(Employee.class);
		
		System.out.println(emp);
		
	}

}
