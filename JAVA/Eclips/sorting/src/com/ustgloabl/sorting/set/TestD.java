package com.ustgloabl.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
public static void main(String[] args) {
	
	LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
	
	ls.add(123.5);
	ls.add(23.5);
	ls.add(12.5);
	ls.add(125.6);
	
	System.out.println("------Using for each---");
	for(Object s: ls) {
		System.out.println(s);
	}
	System.out.println("------Using Iterator---");
	Iterator<Double> it =ls.iterator();
	while(it.hasNext())
	{
		Double p = it.next();
		System.out.println(p);
	}
	
	
	}
}
