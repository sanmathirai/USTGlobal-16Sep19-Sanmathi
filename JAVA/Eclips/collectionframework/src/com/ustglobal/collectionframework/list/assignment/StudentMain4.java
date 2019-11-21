package com.ustglobal.collectionframework.list.assignment;

import java.util.Iterator;

import java.util.ListIterator;
import java.util.Stack;

public class StudentMain4 {
public static void main(String[] args) {
	

	System.out.println("=====Using Linked List ==============\n");
	Stack<Student>  st = new Stack<Student>() ;
	
	Student s1 = new Student(101 , "Sanmathi " ,"SJEC", 45.5);
	Student s2 = new Student(123 , "Sanma", "RIT", 56.88);
	Student s3 = new Student(45, "Megha" ,"MITE", 59.2);
	Student s4 = new Student(123 , "Ashvika", "SDM", 56.88);
	Student s5 = new Student(45, "Eva" , "Alvas", 59.2);
	st.add(s1);
	st.add(s2);
	st.add(s3);
	st.add(s4);
	st.add(s5);



	for(int i =0; i< st.size(); i++)
	{
		Student s = st.get(i);
		System.out.println("id is :"+ s.id);
		System.out.println("Name is :"+s.name);
		System.out.println("percentage :"+ s.percentage);
		System.out.println("Name is :"+s.collegeName);
		
	}

	System.out.println("=====for each ==============\n");
	for(Student s : st) {
		System.out.println(s);
	}

	System.out.println("===using Iterator===========\n");
	Iterator it = st.iterator();
	while(it.hasNext()) {
		Object o =it.next();
		System.out.println(o);

	}

	System.out.println("==using List Iterator=======\n");
	ListIterator lt = st.listIterator();
	while(lt.hasNext()) {
		Object o = lt.next();
		System.out.println(o);

	}

	System.out.println("------>Forward==============\n");
	ListIterator lt1 = st.listIterator();
	while(lt1.hasNext()) {
		Object o = lt1.next();
		System.out.println(o);
	}

	System.out.println("<-------Backward============\n");
	while(lt.hasPrevious()) {
		Object o = lt.previous();
		System.out.println(o);
	}
}
}
