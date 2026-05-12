package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
public class Student {
	
	@Value("1")
	private int stuID;
	@Value("Ganesh")
	private String stdName;
	@Value("ganesh@gmail.com")
	private String stdEmail;
	
	
	
	public Student(int stuID, String stdName, String stdEmail) {
		super();
		this.stuID = stuID;
		this.stdName = stdName;
		this.stdEmail = stdEmail;
	}
	public Student() {
		
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
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
	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stdName=" + stdName + ", stdEmail=" + stdEmail + "]";
	}
	
	
	
	

}
