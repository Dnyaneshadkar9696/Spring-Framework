package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class College {
	
	@Value("D Y Patil")
	private String colName;
	@Value("003")
	private int colID;
	
	@Autowired
	Student s;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String colName, int colID, Student s) {
		super();
		this.colName = colName;
		this.colID = colID;
		this.s = s;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public int getColID() {
		return colID;
	}

	public void setColID(int colID) {
		this.colID = colID;
	}

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "College [colName=" + colName + ", colID=" + colID + ", s=" + s + "]";
	}
	
	
	
	
	
	

}
