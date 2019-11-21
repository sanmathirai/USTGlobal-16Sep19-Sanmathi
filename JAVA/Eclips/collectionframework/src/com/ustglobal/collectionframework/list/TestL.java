package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class TestL {
public static void main(String[] args) {
	ArrayList<Integer> l = new ArrayList<Integer>();
	l.add(12);
	l.add(13);
	l.add(34);
	l.add(3);
	l.add(10);
	
	System.out.println(l);
	
	System.out.println("Befor sort"+ l);
	//sort()//non generic type not allowed//should not passnull//ret type void
	Collections.sort(l); // used to perform operations on list
	
	System.out.println("After sort "+ l);
	
	Collections.reverse(l);//reverse the rreverse
	System.out.println("After reverse :"+l);
	
	Collections.shuffle(l);//reverse the rreverse
	System.out.println("After shuffle :"+l);
	
}
}
