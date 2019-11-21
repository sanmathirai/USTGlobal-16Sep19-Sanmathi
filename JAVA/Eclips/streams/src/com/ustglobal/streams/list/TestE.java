package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestE {
	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(1);
		marks.add(4);
		marks.add(12);
		marks.add(41);
		marks.add(451);
		marks.add(411);
		marks.add(410);

		Comparator<Integer> cmp =(m1 ,m2)->{
			if(m1 > m2) {
				return 1;
						}
				else if(m1 < m2){
					return -1;
					}
				return 0;
				};	
				
		
		
		long noofFailedStudents = marks.stream().filter(i -> i < 40).count();
		System.out.println("No of failed students :"+noofFailedStudents);
		
		Integer i = marks.stream().min(cmp).get();
		System.out.println("Min value   : "+i);
		
		Integer i1 = marks.stream().max(cmp).get();
		System.out.println("Max value   : "+i1);
		

	}
}
