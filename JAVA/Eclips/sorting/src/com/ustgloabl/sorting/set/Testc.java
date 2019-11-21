package com.ustgloabl.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Testc {
	public static void main(String[] args) {

		LinkedHashSet ls = new LinkedHashSet();

		ls.add("sanmathi");
		ls.add("megha");
		ls.add(12);
		ls.add(12);
		ls.add(null);
		ls.add(null);
		ls.add("nmbmn");
		
		
		System.out.println("------Using for each---");
		for(Object s: ls) {
			System.out.println(s);
		}
		System.out.println("------Using Iterator---");
		Iterator it =ls.iterator();
		while(it.hasNext())
		{
			Object p = it.next();
			System.out.println(p);
		}
		
	}
}
