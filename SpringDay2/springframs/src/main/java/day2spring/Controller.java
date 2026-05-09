package day2spring;

import org.springframework.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;

public class Controller {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		// using context we can get the bean
		
		Student s = context.getBean("std",Student.class);
		
		System.out.println(s);
		// here we can do s.set , today we will see throw the property tag and the construct tag.
		
	}

}
