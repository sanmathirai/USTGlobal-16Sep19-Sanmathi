package com.ustglobal.WrapperClasses;

public class TestA {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;//Boxing or Auto boxing
		System.out.println("a is "+i);
		Integer x=10;
		Integer z =  new Integer(20);
		
		int y = z;//unboxing or auto unboxing
		System.out.println("x is "+x);
		
		int value  = Integer.parseInt("123tt");
		System.out.println("value is"+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("value  is" +result);
	}
}
