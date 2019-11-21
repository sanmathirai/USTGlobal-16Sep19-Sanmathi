package com.ustglobal.typecasting.refference;

public class TestA {
public static void main(String[] args) {
		Pen p = new Pen();
		p = new Marker();//up casting
		p.write();
//		p.size; not possible
		System.out.println(p.cost);
		Marker m = (Marker)p;//down casting
		System.out.println(m.cost);
		m.color();
		m.write();
		 
		System.out.println(m.size);
		
}
}
