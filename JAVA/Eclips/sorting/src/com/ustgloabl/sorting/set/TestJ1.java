package com.ustgloabl.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestJ1 {
	public static void main(String[] args) {

		Comparator<Employee1> comp =(e1 , e2)->{

			if(e1.id < e2.id)
			{
				return 1;
			}
			else if (e1.id > e2.id)
			{
				return -1;
			}

			return 0;
		};

		TreeSet<Employee1> ts = new TreeSet<Employee1>(comp);

		Employee1 e1 = new Employee1(1, "SAnmathi", 5.1);
		Employee1 e2 = new Employee1(0, "Radhika", 5.4);
		Employee1 e3 = new Employee1(3, "Megha", 4.9);
		Employee1 e4 = new Employee1(2, "Jhon", 5.11);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("----Using iterator=====");
		Iterator<Employee1> it = ts.iterator();
		while(it.hasNext()) {
			Employee1 b = it.next();

			System.out.println("name :"+b.name);
			System.out.println("Id is :"+b.id);
			System.out.println("height :"+b.height);
			System.out.println("================");

		}

	}

}
