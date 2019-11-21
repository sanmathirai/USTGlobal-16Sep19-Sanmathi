package com.ustgloabl.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PenMain {
	public static void main(String[] args) {
		ArrayList<Pen> al = new ArrayList<Pen>();
		Pen p1 = new Pen(21.2, "Montex");
		Pen p2 = new Pen(20.2, "Montex");
		Pen p3 = new Pen(24.2, "Montex");
		Pen p4 = new Pen(23.2, "Montex");
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);


		displayPenDetails(al);
		Collections.sort(al);
		displayPenDetails(al);


	}
	static void displayPenDetails(ArrayList<Pen> al)
	{
		Iterator<Pen> it = al.iterator() ;
		while(it.hasNext()) {
			Pen p =it.next();
			System.out.println("Pen price :"+p.price);
			System.out.println("Pen brand :"+p.brand);
		}
	}
}
