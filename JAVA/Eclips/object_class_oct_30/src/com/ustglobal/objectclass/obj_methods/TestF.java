package com.ustglobal.objectclass.obj_methods;

public class TestF {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "SAnmathi", 5000);
		Employee e2 = new Employee(2, "SAnmathi", 5000);
		Employee e3 = new Employee(1, "SAnmathi", 5000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e3));
	}
}
