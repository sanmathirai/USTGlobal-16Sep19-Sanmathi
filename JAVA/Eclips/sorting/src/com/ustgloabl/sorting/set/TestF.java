package com.ustgloabl.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
public static void main(String[] args) {
	TreeSet<String> ts = new TreeSet<String>();
	ts.add("Hi");
	ts.add("hello");
	ts.add("namaste");
	ts.add("Sanathi");
	ts.add("Sanathi");
	
	System.out.println("------Using for each---");
	for(Object s: ts) {
		System.out.println(s);
	}
	System.out.println("------Using iterator---");
	Iterator<String> it = ts.iterator() ;
	while(it.hasNext()) {
		String o = it.next();
		System.out.println(o);
	}
	
}
}
