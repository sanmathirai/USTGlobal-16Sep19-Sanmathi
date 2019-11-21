package com.ustgloabl.sorting.set;

import java.util.Comparator;

public class SortByCid implements Comparator<Customer>{
	
	
@Override
public int compare(Customer o1, Customer o2) {
	if(o1.id>o2.id)
		return 1;
	else if(o1.id<o2.id) {
		return -1;
	}
	return 0;
}
}
