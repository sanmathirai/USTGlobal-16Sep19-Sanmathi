package com.ustglobal.accessmodifiers.pkg1;

import com.ustglobal.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
		/*
		 * d.a;
		 * d.add();
		 * Not possible because private member of other class
		 */
		/*
		 * System.out.println(d.b); d.sub(); //default System.out.println(d.c); d.mul();
		 */
		//Protected 
		System.out.println(d.name);
		d.div();
		//public
		Sample s= new Sample();
		//protected
		s.mul();
		System.out.println(s.c);



	}
}
