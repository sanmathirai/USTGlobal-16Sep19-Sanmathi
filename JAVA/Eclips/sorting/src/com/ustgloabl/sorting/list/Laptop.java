package com.ustgloabl.sorting.list;

public class Laptop implements Comparable<Laptop>{
	double price;
	int ram;
	String name;

	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

	public int compareTo(Laptop l) {
		/*
		 * Integer i = this.ram; // Integer j = l.ram;
		 * 
		 * return i.compareTo(j);
		 */
		/*
		 * Double i = this.price; // Double j = l.price;
		 * 
		 * return i.compareTo(j);
		 */

		String p = this.name.toLowerCase(); 
		String q = l.name.toLowerCase();

		return p.compareTo(q);
	};

}
