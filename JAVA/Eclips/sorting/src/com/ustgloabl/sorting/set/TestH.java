package com.ustgloabl.sorting.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
public static void main(String[] args) {
	TreeSet<Employee> hs = new TreeSet<Employee>();
	Employee e1 = new Employee(12, "sanmathi", 2000.5);
	Employee e2 = new Employee(12, "teju", 2000.5);
	Employee e3 = new Employee(12, "Girish", 2000.5);
	Employee e4 = new Employee(12, "sheela", 2000.5);//if we dont overide eqaus booth the pbjects are allowed
	Employee e5 = new Employee(12, "sheela", 2000.5);//
	hs.add(e1);
	hs.add(e2);
	hs.add(e3);
	hs.add(e4);
	hs.add(e5);

	System.out.println("----Using iterator---");
	Iterator<Employee> it = hs.iterator();
	while(it.hasNext()) {
		Employee e = it.next();
	 
		System.out.println("Id is :"+e.id);
		System.out.println("Name is"+e.name);
		System.out.println("Salary"+e.salary);
		System.out.println("================");
		
	}
	
}
}
