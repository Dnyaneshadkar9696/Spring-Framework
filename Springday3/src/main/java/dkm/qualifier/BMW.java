package dkm.qualifier;

import org.springframework.stereotype.Component;

@Component("BMW")
public class BMW implements Racing{
	
	@Override
	public String racing() {
		// TODO Auto-generated method stub
		
		String dd = "The Man is racing the BMW...";
		
		return dd;
	}

}
