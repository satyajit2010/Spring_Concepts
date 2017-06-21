package com.practice.jdbc.model;

import java.math.BigDecimal;

public class Employee {
	private String eid;
	private String fname;
	private String lname;
	private BigDecimal salary;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", fname=" + fname + ", lname=" + lname + ", salary=" + salary + "]";
	}

}
