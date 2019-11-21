package com.ustglobal.typecasting.premitive;

public class TestA {

	public static void main(String[] args) {

		byte a = 10;
		int b = a;//Implicit casting
		System.out.println("a is :"+ a);
		System.out.println("b is :"+ b);
		int p = 20;
		double q = p;
		System.out.println("p is :"+ p);
		System.out.println("q i "+q);
		System.out.println("=============");
		
		double x = 18.67;
		int y = (int) x;
		System.out.println("y is "+y);
		byte z = (byte) x;
		System.out.println("z is "+z);
		char r = (char) x;
		System.out.println("r is "+r);
		
	
	}
}
