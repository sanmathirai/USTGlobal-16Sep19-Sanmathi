package com.ustgloabl.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
	public static void main(String[] args) {
		PriorityQueue pq =new PriorityQueue();
		pq.add(12);
		pq.add(24);
		pq.offer(2);
		pq.offer(2);

		
		System.out.println("----Using iterator=====");
		Iterator it = pq.iterator();
		while(it.hasNext()) {
			
			Object b = it.next();

			System.out.println("Customer name :"+b);


		}
	}
}
