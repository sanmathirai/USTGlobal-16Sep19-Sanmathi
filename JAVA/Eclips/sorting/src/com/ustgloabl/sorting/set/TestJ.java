package com.ustgloabl.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
public static void main(String[] args) {
	
	SortByCname sb= new SortByCname();
	SortByCid sb1= new SortByCid();
	
	
	TreeSet<Customer> ts = new TreeSet<Customer>(sb);
	Customer b1 = new Customer( 4,"sanm", 6565);
	Customer b2 = new Customer( 8, "xyz", 6561);
	Customer b3 = new Customer( 4, "zzz", 65515);
	Customer b4 = new Customer( 3, "yyy", 65955);
	Customer b5 = new Customer( 5, "ooo", 65955);

	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	
 
	System.out.println("----Using iterator=====");
	Iterator<Customer> it = ts.iterator();
	while(it.hasNext()) {
		Customer b = it.next();

		System.out.println("Customer name :"+b.name);
		System.out.println("pincode is"+b.id);
		System.out.println("MICR"+b.salary);
		System.out.println("================");

	}
}
}
