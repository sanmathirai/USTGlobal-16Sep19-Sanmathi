package com.ustglobal.collectionframework.list.assignment;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeMain3 {
public static void main(String[] args) {
	LinkedList<Employee>  al = new LinkedList<Employee>() ;
	Employee s1 = new Employee(123458697,1234568l,45.2f,201555444444.0,true,'A');
	Employee s2 = new Employee(123458697,1234568l,45.2f,201555444444.0,true,'A');
	Employee s3 = new Employee(123458697,1234568l,45.2f,201555444444.0,true,'A');
	Employee s4 = new Employee(123458697,1234568l,45.2f,201555444444.0,true,'A');
	Employee s5 = new Employee(123458697,1234568l,45.2f,201555444444.0,true,'A');
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);



	for(int i =0; i< al.size(); i++)
	{
		Employee s = al.get(i);
		System.out.println("id is :"+ s.adharNo);
		System.out.println("Name is :"+s.blockNo);
		System.out.println("percentage :"+ s.mobNo);
		System.out.println("percentage :"+ s.pf);
		System.out.println("Salary :"+ s.salary);
		System.out.println("percentage :"+ s.isMarried);
		System.out.println("percentage :"+ s.blockNo);
	}

	System.out.println("=====for each ==============\n");
	for(Employee s : al) {
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
