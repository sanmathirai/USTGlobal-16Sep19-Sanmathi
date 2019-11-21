package com.ustglobal.objectclass.obj_methods;

public class TestC {

		public static void main(String[] args) {
			Student s = new Student(1, "Sanmathi", 60);
			int id = s.hashCode();
			System.out.println("id is :"+id);
			System.out.println(s);
		}
}
