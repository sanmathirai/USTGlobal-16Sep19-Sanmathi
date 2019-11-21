package com.ustgloabl.sorting.list;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA{
public static void main(String[] args) {
	ArrayList<Student> al= new ArrayList<>();
	Student s1 =new Student(1,"Kanmthi", 45);
	Student s2 =new Student(6,"Meghna", 47);
	Student s3 =new Student(0,"ashvika", 46);
	Student s4 =new Student(2,"Zeepthi", 30);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	
	displayStudent(al);
	Collections.sort(al);
	System.out.println("=====After Sorting ======:\n");
	 displayStudent(al);
	
}
static void displayStudent(ArrayList<Student> al) {
	Iterator<Student> it = al.iterator();
	while(it.hasNext()) {
		Student s =it.next();
		System.out.println("Name is"+s.name);
		System.out.println("Id is"+s.id);
		System.out.println("Percentage"+s.percentage);
		System.out.println("------------------------");
	}
	
}
}
