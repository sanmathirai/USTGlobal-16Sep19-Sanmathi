package com.ustglobal.collectionframework.list.assignment;


import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class StudentMain2 {
public static void main(String[] args) {
	System.out.println("=====Using Vector ==============\n");
	Vector<Student>  v = new Vector<Student>() ;
	Student s1 = new Student(101 , "Sanmathi " ,"SJEC", 45.5);
	Student s2 = new Student(123 , "Sanma", "RIT", 56.88);
	Student s3 = new Student(45, "Megha" ,"MITE", 59.2);
	Student s4 = new Student(123 , "Ashvika", "SDM", 56.88);
	Student s5 = new Student(45, "Eva" , "Alvas", 59.2);
	v.add(s1);
	v.add(s2);
	v.add(s3);
	v.add(s4);
	v.add(s5);



	for(int i =0; i< v.size(); i++)
	{
		Student s = v.get(i);
		System.out.println("id is :"+ s.id);
		System.out.println("Name is :"+s.name);
		System.out.println("percentage :"+ s.percentage);
	}

	System.out.println("=====for each ==============\n");
	for(Student s : v) {
		System.out.println(s);
	}
	
	System.out.println("===using Iterator===========\n");
	Iterator it = v.iterator();
	while(it.hasNext()) {
		Object o =it.next();
		System.out.println(o);

	}

	System.out.println("==using List Iterator=======\n");
	ListIterator lt = v.listIterator();
	while(lt.hasNext()) {
		Object o = lt.next();
		System.out.println(o);

	}

	System.out.println("------>Forward==============\n");
	ListIterator lt1 = v.listIterator();
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
