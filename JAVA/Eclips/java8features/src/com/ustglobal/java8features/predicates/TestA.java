package com.ustglobal.java8features.predicates;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		Predicate<Vote> p = s -> {
			if(s.age>=18)
				return true;
			else 
				return false;

		};
		Vote s = new Vote(10,"Sanmathi",23);
		boolean result = p.test(s);
		System.out.println("Result is :"+result);
	}
}
