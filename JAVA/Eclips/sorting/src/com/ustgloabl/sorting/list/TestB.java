package com.ustgloabl.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		LinkedList<Laptop> lp = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(12222.1, 4," aP");
		Laptop lp2 = new Laptop(32222.1, 8," Hac");
		Laptop lp3 = new Laptop(42222.1, 16," Dell");
		Laptop lp4 = new Laptop(52222.1, 2," benovo");

		lp.add(lp1);
		lp.add(lp2);
		lp.add(lp3);
		lp.add(lp4);
		lp.add(new Laptop(2000, 2, "Acer"));
		
		displayLaptopDetails(lp);
		Collections.sort(lp);
		System.out.println("=======After Sorting=======");
		displayLaptopDetails(lp);
	}
	static void displayLaptopDetails(LinkedList<Laptop> l)
	{
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {

			Laptop lt = it.next();
			System.out.println("Brand is :"+lt.name);
			System.out.println("COst is :"+lt.price);
			System.out.println("Ram is    :"+ lt.ram);
			System.out.println("----");
		}	
	}

}
