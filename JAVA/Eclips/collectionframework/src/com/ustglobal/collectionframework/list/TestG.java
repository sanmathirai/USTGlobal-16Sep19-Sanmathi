package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
public static void main(String[] args) {
	LinkedList li = new LinkedList();
	li.add(23);
	li.add(88.1);
	li.add(true);
	li.add("Good evening");
	
	
	
	System.out.println("===using For loop====");
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
		
	}
	System.out.println("===using For each===");
	
	for(Object o : li) {
		System.out.println(o);
	}
	
	System.out.println("===using Iterator==");
	Iterator it = li.iterator();
	while(it.hasNext()) {
		Object o =it.next();
		System.out.println(o);
		
	}
	
	System.out.println("==using List Iterator==");
	ListIterator lt = li.listIterator();
	while(lt.hasNext()) {
		Object o = lt.next();
		System.out.println(o);

		}
	
	System.out.println("------>Forward");
	ListIterator lt1 = li.listIterator();
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
