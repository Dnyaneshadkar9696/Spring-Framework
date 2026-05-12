package dkm.qualifier;

import org.springframework.stereotype.Component;

@Component("Ferrari")
public class Ferrari implements Racing{
	
	
	@Override
	public String racing() {
		// TODO Auto-generated method stub
		
	
		String sd = "The Man is racing the Ferrari...";
		return sd;
		
		
		
	}
	
	
	
	

}
