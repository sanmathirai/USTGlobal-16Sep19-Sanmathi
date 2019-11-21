package com.ustgloabl.sorting.list;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker>{
	@Override
	public int compare(Marker m1, Marker m2) {
	String i =m1.color;
	String j =m2.color;
	return i.compareTo(j);
	}

}
