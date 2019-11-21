package com.ustglobal.objectclass.obj_methods;

public class TestA {
	
	public static void main(String[] args) {
		
		Pen p = new Pen();
		int pHashcode = p.hashCode();		
		System.out.println(pHashcode);
		
		Pen q = new Pen();
		int qHashcode = q.hashCode();
		System.out.println(qHashcode);
	}
		
}
