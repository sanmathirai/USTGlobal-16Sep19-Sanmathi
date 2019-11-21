package com.ustgloabl.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
	
	public static void main(String[] args) {
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(50, "blue"));
		al.add(new Marker(60, "green"));
		al.add(new Marker(80, "red"));
		al.add(new Marker(40, "yellow"));
		System.out.println("Before Sorting----->");
		SortByprice sb = new SortByprice();
		displayMarker(al);
//	Collections.sort(al,sb);
		System.out.println("Afetr Sorting----->");
//		displayMarker(al);
		SortByColor sb1 = new SortByColor();
		Collections.sort(al,sb1);
	}
	
	static void displayMarker(ArrayList<Marker> al)
	{
		Iterator<Marker> it = al.iterator() ;
		while(it.hasNext()) {
			Marker p =it.next();
			System.out.println("Marker  price :"+p.price);
			System.out.println("Marker  brand :"+p.brand);
		}
	}
}
