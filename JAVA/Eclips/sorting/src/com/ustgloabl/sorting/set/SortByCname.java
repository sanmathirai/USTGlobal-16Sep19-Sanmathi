package com.ustgloabl.sorting.set;

import java.util.Comparator;

public class SortByCname implements Comparator<Customer>{
public int compare(Customer o1, Customer o2) {
	return o1.name.compareTo(o2.name);
}
}
