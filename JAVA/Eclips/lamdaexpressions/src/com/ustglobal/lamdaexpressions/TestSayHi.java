package com.ustglobal.lamdaexpressions;

public class TestSayHi {
	public static void main(String[] args) {
		SayHi hi = ()->{
			System.out.println("Hi");
		};
		hi.sayHi();
	}
}
