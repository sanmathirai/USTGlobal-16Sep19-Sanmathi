package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(23);
	al.add(88.1);
	al.add(true);
	al.add("Good evening");
	
	Iterator it = al.iterator();
	Object o1 = it.next();
	System.out.println("obj 1 "+o1);
	
	Object o2 = it.next();
	System.out.println("obj 2 "+o2);
	
	Object o3 = it.next();
	System.out.println("obj 3 "+o3);
	
	Object o4 = it.next();
	System.out.println("obj 4 "+o4);
	
	boolean b = it.hasNext();
	System.out.println(b);
	
//	Object o5 = it.next();
//	System.out.println("obj 5"+ o5);
	System.out.println("===Using For loop====");
	for(int i = 0; i<al.size() ; i++) {
		
		Object o = al.get(i);
				System.out.println(o);
	}
	
	
	System.out.println("===Using Iterator====");
	ArrayList al1 = new ArrayList();
	al1.add(100);
	al1.add(200.1);
	al1.add(false);
	al1.add("Good evening");
	
	Iterator it1 = al1.iterator();
	while(it1.hasNext())
	{
		Object ob = it1.next();
		System.out.println(ob);
	}
}
}
