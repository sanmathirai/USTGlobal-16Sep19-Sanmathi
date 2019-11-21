package com.ustglobal.collectionframework.list.assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class StudentMain3 {
public static void main(String[] args) {
	
	System.out.println("=====Using Linked List ==============\n");
	LinkedList<Student>  ll = new LinkedList<Student>() ;
	Student s1 = new Student(101 , "Sanmathi " ,"SJEC", 45.5);
	Student s2 = new Student(123 , "Sanma", "RIT", 56.88);
	Student s3 = new Student(45, "Megha" ,"MITE", 59.2);
	Student s4 = new Student(123 , "Ashvika", "SDM", 56.88);
	Student s5 = new Student(45, "Eva" , "Alvas", 59.2);
	ll.add(s1);
	ll.add(s2);
	ll.add(s3);
	ll.add(s4);
	ll.add(s5);



	for(int i =0; i< ll.size(); i++)
	{
		Student s = ll.get(i);
		System.out.println("id is :"+ s.id);
		System.out.println("Name is :"+s.name);
		System.out.println("percentage :"+ s.percentage);
	}

	System.out.println("=====for each ==============\n");
	for(Student s : ll) {
		System.out.println(s);
	}
	
	System.out.println("===using Iterator===========\n");
	Iterator it = ll.iterator();
	while(it.hasNext()) {
		Object o =it.next();
		System.out.println(o);

	}

	System.out.println("==using List Iterator=======\n");
	ListIterator lt = ll.listIterator();
	while(lt.hasNext()) {
		Object o = lt.next();
		System.out.println(o);

	}

	System.out.println("------>Forward==============\n");
	ListIterator lt1 = ll.listIterator();
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
