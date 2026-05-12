package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Myconfig;
import com.entity.College;
import com.entity.Student;
//
//import appconfig.Theconfig;
//import dkm.qualifier.Man;
import dkm.qualifier.Person;
import dkm.qualifier.Racing;

public class Controller {
	
	public static void main(String[] args) {
		
		// The topics learned in Day 3 are 
//		1. DI with the Annotation
//		2. Multiple Object Creation
//		3. @Bean and @Configuration
//		4.@Qualifier
		
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
		
		// directly context.getbeans
		
		// Above the reference in college of the student the reference of the student is passed and the the DI id done
		// now access the College
		
//		College  c = context.getBean(College.class);
//		
//		System.out.println(c);
		
		//-------------------------------------------------------//
		// Multiple bean creation
		
//		Student s = context.getBean(Student.class);
//		
//		System.out.println(s);
//		
//		Student s1 = context.getBean(Student.class);
//		
//		System.out.println(s == s1);
//		
//		// Ans - false 
//		
//		System.out.println(s.hashCode());
//		System.out.println(s1.hashCode());
		
		
		// ---------------------------------------------------------------//
		
		// The bean is created using the bean and The Configuration Annotation
		
//		Student s = context.getBean(Student.class);
//		
//		System.out.println(s);
		
		///-----------------------------------------------------------------------///
	
		
		// The @Qualifier Annotation
		
		
		Person p = context.getBean(Person.class);
		
		System.out.println(p.getB().racing());
		
		
		System.out.println(p.getF().racing());
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
