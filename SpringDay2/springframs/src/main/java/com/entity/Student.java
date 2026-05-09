package com.entity;

public class Student {
	
	
	private int stdID;
	private String stdName;
	private String stdCity;
	private College collegeid;
	
	// you can put any reference name for college here just make shoer to make changes below
	public Student() {
	
	}
	public Student(int stdID, String stdName, String stdCity, College collegeid) {
		super();
		this.stdID = stdID;
		this.stdName = stdName;
		this.stdCity = stdCity;
		this.collegeid = collegeid;
	}
	public int getStdID() {
		return stdID;
	}
	public void setStdID(int stdID) {
		this.stdID = stdID;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdCity() {
		return stdCity;
	}
	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}
	public College getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(College collegeid) {
		this.collegeid = collegeid;
	}
	@Override
	public String toString() {
		return "Student [stdID=" + stdID + ", stdName=" + stdName + ", stdCity=" + stdCity + ", collegeid=" + collegeid
				+ "]";
	}
	
	
	
	
}

