package com.ustglobal.objectclass.obj_methods;

public class Student {

	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	

	@Override
	public int hashCode() {
		return id;
	}
	

	
}
