package com.ustglobal.lamdaexpressions;

public class TestAdd implements AddInterface {
public static void main(String[] args) {
		
	TestAdd t = new TestAdd();
	int sum  = t.add(20, 10);
	System.out.println("Sum is :"+sum);
}
	@Override
	public int add(int a, int b) {
		
		return a+b;
		
		}
}
