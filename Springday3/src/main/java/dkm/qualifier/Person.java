package dkm.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	// The in the person we merge the BMW and Ferrari Objects so we now can access them as well
	
	@Autowired
	@Qualifier("BMW")
	BMW b;
	
	
	@Autowired
	@Qualifier("Ferrari")
	Ferrari f;

	// basically the id that we passed in the component.

	


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(BMW b, Ferrari f) {
		super();
		this.b = b;
		this.f = f;
	}


	public BMW getB() {
		return b;
	}


	public void setB(BMW b) {
		this.b = b;
	}


	public Ferrari getF() {
		return f;
	}


	public void setF(Ferrari f) {
		this.f = f;
	}


	@Override
	public String toString() {
		return "Person [b=" + b + ", f=" + f + "]";
	}
	

}
