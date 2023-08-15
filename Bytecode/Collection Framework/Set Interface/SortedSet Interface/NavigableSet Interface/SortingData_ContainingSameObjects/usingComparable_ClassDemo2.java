// Collections Class is used when duplicate data come and requirment is that we have to sort data.

import java.util.*;

class UsingComparableClassDemo2{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add("King");
		al.add("Chicken");
		al.add("Apple");
		al.add("Xerox");
		al.add("Xerox");

		System.out.println("Before Sorting :" + al);

		Collections.sort(al);

		System.out.println("After Sorting :" + al);

	}
}

/*
DrawBack :
	1. Objects that are to be sorted must be type of Comparable.

	public static <T extends java.lang.Comparable<? super T>> void sort(java.util.List<T>);

(it is avoided by using Comparator interface)
 */


