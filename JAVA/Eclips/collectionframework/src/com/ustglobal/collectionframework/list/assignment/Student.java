package com.ustglobal.collectionframework.list.assignment;

public class Student {
	byte n;
	int id;
	String name;
	String collegeName;
	double percentage;


	 

	public Student(int id, String name, String collegeName, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.collegeName = collegeName;
		this.percentage = percentage;
	}




	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", collegeName=" + collegeName + ", percentage=" + percentage
				+ "\n";
	}

	


}
