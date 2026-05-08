package controllerspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;

public class Controller {
	
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		
		Student s =  context.getBean(Student.class);
		
		s.setStdId(2);
		s.setStdName("Viraj");
		s.setStdEmail("viraj@gmail.com");
		
		System.out.println(s);
		
		// done using the xml configuration.
	}

}
