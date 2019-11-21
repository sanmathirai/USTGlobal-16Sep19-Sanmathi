package com.ustglobal.collectionframework.list.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.ustglobal.collectionframework.list.assignment.Student;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student>  al = new ArrayList<Student>() ;
		Student s1 = new Student(101 , "Sanmathi " ,"SJEC", 45.5);
		Student s2 = new Student(123 , "Sanma", "RIT", 56.88);
		Student s3 = new Student(45, "Megha" ,"MITE", 59.2);
		Student s4 = new Student(123 , "Ashvika", "SDM", 56.88);
		Student s5 = new Student(45, "Eva" , "Alvas", 59.2);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);



		for(int i =0; i< al.size(); i++)
		{
			Student s = al.get(i);
			System.out.println("id is :"+ s.id);
			System.out.println("Name is :"+s.name);
			System.out.println("percentage :"+ s.percentage);
		}

		System.out.println("=====for each ==============\n");
		for(Student s : al) {
			System.out.println(s);
		}
		
		System.out.println("===using Iterator===========\n");
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object o =it.next();
			System.out.println(o);

		}

		System.out.println("==using List Iterator=======\n");
		ListIterator lt = al.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);

		}

		System.out.println("------>Forward==============\n");
		ListIterator lt1 = al.listIterator();
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
