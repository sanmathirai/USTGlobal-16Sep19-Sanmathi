package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(1);
		marks.add(4);
		marks.add(12);
		marks.add(41);
		marks.add(451);
		marks.add(411);
		marks.add(410);
		
		List<Integer> l= marks.stream().sorted().collect(Collectors.toList());
		
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()) {
			Integer val =it.next();
			System.out.println("Val is"+ val);
		}



	}
}
