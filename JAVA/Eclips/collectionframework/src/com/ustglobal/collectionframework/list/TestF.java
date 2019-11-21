package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("anupma");
		al.add("Roza");

		al.add("Sanmathi");

		al.get(0);
		String name = al.get(0);
		System.out.println(name);
		System.out.println("====Using Iterator");
		Iterator<String> it = al.iterator();

		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);

		}
		System.out.println("====Using List Iterator");
		ListIterator<String> l = al.listIterator();
		while(l.hasNext()) {
			String s = l.next();
			System.out.println(s);

		}

		System.out.println("====Using for each");

		for(String n : al) {
			System.out.println(n);
		}
	}
}
