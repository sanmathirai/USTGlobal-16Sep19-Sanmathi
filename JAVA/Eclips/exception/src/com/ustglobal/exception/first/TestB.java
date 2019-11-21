package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {

		System.out.println("Main started");
		int a = 10;
		int b = 0;
		
		try {
			b = a/0;
			System.out.println(b);
			System.out.println("Hello");
			System.out.println("Hapy deepavali");
		}
		catch(ArithmeticException ae) {
			System.out.println("Number devided by zero");
		}
		
		
		System.out.println("Main ended");
	}
}
