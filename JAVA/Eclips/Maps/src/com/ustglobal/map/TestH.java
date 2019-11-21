package com.ustglobal.map;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Ajay");
		ht.put(15, "Vijay");
		ht.put(103, "Sujay");
		ht.put(104, "Mony");
		ht.put(101, "sriram");
		ht.put(501, "srim");
		ht.put(800, "sriram");
		//ht.put(null , "jkj");NullPointerException
		//ht.put(108, null,);NullPointerException
		System.out.println("data "+ht);
		
	}
}
