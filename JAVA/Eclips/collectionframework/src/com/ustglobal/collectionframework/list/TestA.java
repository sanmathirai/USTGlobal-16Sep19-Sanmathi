package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(13);
		al.add("sanmathi");
		al.add(true);
		al.add(null);
		al.add('A');
		Object o = al.get(1);
		System.out.println("The data is" + o);
		
		for(int i = 0; i<al.size() ; i++) {
			Object obj = al.get(i);
			System.out.println("The data "+i+ " is :"+obj);
		}
	}
}
