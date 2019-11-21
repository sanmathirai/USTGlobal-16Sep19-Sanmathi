package com.ustglobal.lamdaexpressions;

public class TestMultiply {
	public static void main(String[] args) {

	MultiplyInterface multi = (a,b)->a*b;
	int mul = multi.multiply(20, 30);
	System.out.println("Product is :"+mul);
	
	}
}
