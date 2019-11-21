package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {
public static void main(String[] args) {
	ArrayList<String> al =new ArrayList<>();
	al.add("jhkjh");
	al.add("erer");
	al.add("jhkjh");
	al.add("xrer");
	al.add("zhkjh");
	al.add("erer");
	System.out.println("Before sort===");
	System.out.println(al);
	Collections.sort(al);
	
	System.out.println("Afetr sort===");
	System.out.println(al);
	
	
	
}
}
