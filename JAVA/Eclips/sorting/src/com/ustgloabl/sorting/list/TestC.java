package com.ustgloabl.sorting.list;

import java.util.LinkedList;

public class TestC {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);

		Integer peakElement  = l.peek();
		System.out.println("Peak element :"+peakElement);
		Integer peakFirst  = l.peekFirst();
		System.out.println("Peak element :"+peakFirst);
		Integer peakLast  = l.peekLast();
		System.out.println("Peak element :"+peakLast);
		System.out.println("After peak ---- :"+l);

		Integer poll  = l.poll();
		System.out.println("poll element :"+poll);
		Integer pollFirst  = l.pollFirst();
		System.out.println("poll element :"+pollFirst);
		Integer pollLast  = l.pollLast();
		System.out.println("poll element :"+pollLast);
		System.out.println("After poll ---- :"+l);

		l.push(12);
		System.out.println("push element :"+l);
		Integer p = l.pop();
		System.out.println("popelement :"+p);
		System.out.println("After pop :"+l);


	}
}
