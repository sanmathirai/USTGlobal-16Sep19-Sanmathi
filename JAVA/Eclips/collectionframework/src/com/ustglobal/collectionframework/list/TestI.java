package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class TestI {
public static void main(String[] args) {
	Stack v1 = new Stack();
	
	v1.add(23);
	v1.add(88.1);
	v1.add(true);
	v1.add("Good evening");
	v1.add(null);
	


	System.out.println("===using For loop====");
	for (int i = 0; i < v1.size(); i++) {
		System.out.println(v1.get(i));
		
	}
	System.out.println("===using For each===");
	
	for(Object o : v1) {
		System.out.println(o);
	}
	
	System.out.println("===using Iterator==");
	Iterator it = v1.iterator();
	while(it.hasNext()) {
		Object o =it.next();
		System.out.println(o);
		
	}
	
	System.out.println("==using List Iterator==");
	ListIterator lt = v1.listIterator();
	while(lt.hasNext()) {
		Object o = lt.next();
		System.out.println(o);

		}
	
	System.out.println("------>Forward");
	ListIterator lt1 = v1.listIterator();
	while(lt1.hasNext()) {
		Object o = lt1.next();
		System.out.println(o);
	}
	
	System.out.println("<-------Backward");
	while(lt.hasPrevious()) {
		Object o = lt.previous();
		System.out.println(o);
	}
	
}
}
