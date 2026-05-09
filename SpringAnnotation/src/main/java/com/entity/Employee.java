package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Employee {
	
	
	@Value("1")
	private int empID;
	@Value("Ganesh Kumar")
	private String empName;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + "]";
	}
	
	

}
