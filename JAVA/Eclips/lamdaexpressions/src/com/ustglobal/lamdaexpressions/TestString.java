package com.ustglobal.lamdaexpressions;

public class TestString {

	public static void main(String[] args) {

		Message msg = (message)->{
			System.out.println(message);
			System.out.println("hi");
		};

		msg.greet("hello");
	}
}
