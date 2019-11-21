package com.ustglobal.Immuatable;

public class TestString {
	public static void main(String[] args) {
		MyString m1 = new MyString(10, "Sanmathi");

		System.out.println(m1.getName());
		System.out.println(m1.getRollNo());
		
		
		MyString m2 = m1.changeContent(30, "aish");
		System.out.println(m2.getName());
		System.out.println(m2.getRollNo());
	

	}
}
