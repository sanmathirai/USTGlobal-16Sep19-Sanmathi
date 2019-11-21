package com.ustgloabl.sorting.list;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;
	String color;
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	@Override
	public int compareTo(Pen o) {
//	Double i = this.price;
//	Double j = o.price;
//	
//	return i.compareTo(j);
	
	
	String i = this.brand.toLowerCase();
	String j = o.brand.toLowerCase();
	
	return i.compareTo(i);
	}

}
