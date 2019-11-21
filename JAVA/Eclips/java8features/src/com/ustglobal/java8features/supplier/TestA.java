package com.ustglobal.java8features.supplier;

import java.util.function.Supplier;

public class TestA {
	public static void main(String[] args) {
		
		Supplier<Student> s = ()->new Student(2,"sanmathi",65.5);
		Student s1 = s.get();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println("Percentage :"+s1.percentage);

		Supplier<Integer> i = () ->20;
		int val = i.get();
		System.out.println(val);

		Supplier<String> sp = ()->"Good night";
		String v = sp.get();
		System.out.println("Value "+v);
	}


}
