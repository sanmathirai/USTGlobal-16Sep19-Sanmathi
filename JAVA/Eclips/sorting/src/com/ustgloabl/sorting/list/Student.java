package com.ustgloabl.sorting.list;

public class Student implements Comparable<Student>{
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
	public int compareTo(Student s) {
		/*
		 * if(this.id>s.id) { return 1; } else if(this.id<s.id) { return -1; } return 0;
		 */
		/*
		 * if(this.percentage>s.percentage) { return 1; } else
		 * if(this.percentage<s.percentage) { return -1; } return 0; }
		 */

		/*
		 * String p = this.name; String q = s.name;
		 * 
		 * return p.toLowerCase().compareTo(q.toLowerCase());
		 */
		Integer i = this.id; //
		Integer j = s.id;
		
		return i.compareTo(j);
		
		
		
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}


}
