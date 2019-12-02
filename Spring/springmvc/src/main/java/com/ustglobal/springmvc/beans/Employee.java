package com.ustglobal.springmvc.beans;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private String password;
	private String gender;
	private Date date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	 
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
