package com.ustglobal.objectclass.obj_methods;

public class TestE {
	public static void main(String[] args) {
		
		Cow c1 = new Cow("Gowri",1,5000.00);
		Cow c2 = c1;
		Cow c3 = new Cow("Gowri",2,4000.00);
		Cow c4 = new Cow("Gowri",2,1);
		
		System.out.println(c1.equals(c2));
		System.out.println(c3.equals(c3));
		System.out.println(c3.equals(c4));
	}
}
