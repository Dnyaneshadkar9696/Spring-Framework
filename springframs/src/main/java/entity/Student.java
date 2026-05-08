package entity;

public class Student {
	
	
	private int stdId;
	private String stdName;
	private String stdEmail;
	
	
	
	

	public Student() {
		
	}

	public Student(int stdId, String stdName, String stdEmail) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdEmail = stdEmail;
	}
	
	public int getStdId() {
           return stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdEmail() {
		return stdEmail;
	}

	public void setStdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdEmail=" + stdEmail + "]";
	}
	
	

}
