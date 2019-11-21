package com.ustgloabl.sorting.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		SortByName sb= new SortByName();
		SortByPincode sb1= new SortByPincode();
		SortByMicr sb2= new SortByMicr();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sb2);
		Bank b1 = new Bank("Vijaya", 4546, 6565);
		Bank b2 = new Bank("SBI", 8546, 6561);
		Bank b3 = new Bank("Canara", 4546, 65515);
		Bank b4 = new Bank("Axis", 3546, 65955);
		Bank b5 = new Bank("Axis", 3546, 65955);

		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
	 
		System.out.println("----Using iterator=====");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();

			System.out.println("Bank name :"+b.name);
			System.out.println("pincode is"+b.pincode);
			System.out.println("MICR"+b.micr);
			System.out.println("================");

		}
	}
}
