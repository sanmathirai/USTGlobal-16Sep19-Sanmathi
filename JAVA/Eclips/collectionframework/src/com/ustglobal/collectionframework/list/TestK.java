package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {

	public static void main(String[] args) {
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(34.5);
		al.add(34.5);
		al.add(87.5);
		al.add(12.5);
		al.add(34.5);
		al.add(null);
		al.add(null);

		System.out.println(al);

		al.add(1 ,25.1);
		System.out.println("After Adding second index"+al);
		al.remove(0);//remove 1st match
		System.out.println("After removing zero index"+al);
		al.remove(null);
		Double val =al.get(4);
		System.out.println("Getting 4th Index"+ " index"+val);
		al.set(2,77.6);
		System.out.println("After replacing second index"+al);
		al.clear();
		System.out.println("After removing all elements"+al);
		al.contains(54.6);

		List< Double> al1 = new ArrayList<>();


		al1.add(25.5);
		al1.add(25.5);
		al1.add(null);
		System.out.println("Al1 :"+al1);
		al1.remove(0);//remove 1st match
		al1.addAll(al);
		System.out.println("After adding al1 :"+al1);

		boolean contain = al.containsAll(al1);
		System.out.println("Contain all  :"+contain);
		System.out.println("Before remove :"+al1);

		boolean res = al1.removeAll(al1);//present in list also
		System.out.println("After Removing all al1 :"+al1);
		
		System.out.println("Remove all of al1 al1 :"+res);
		












	}
}
