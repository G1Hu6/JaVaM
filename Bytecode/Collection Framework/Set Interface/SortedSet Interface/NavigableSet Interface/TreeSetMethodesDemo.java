import java.util.*;

class TreeSetMethodesDemo{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();
/*
		ts.add("Mac");
		ts.add("Apple");
		ts.add(18);
		ts.add("Str");

		Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        at java.base/java.lang.Integer.compareTo(Integer.java:59)
        at java.base/java.util.TreeMap.put(TreeMap.java:566)
        at java.base/java.util.TreeSet.add(TreeSet.java:255)
        at TreeSetMethodesDemo.main(TreeSetMethodesDemo.java:9)

*/
		ts.add("Mac");
                ts.add("Apple");
                ts.add("King");
                ts.add("ll");
		ts.add("Pranav");

		Iterator cursor = ts.iterator();
		System.out.println(cursor.getClass().getName());			      System.out.println(ts);
	
		//public int size();
		System.out.println(ts.size());

		//public boolean isEmpty();
		System.out.println(ts.isEmpty());

		//public boolean contains(java.lang.Object);
		System.out.println(ts.contains("Mac"));
		//System.out.println(ts.contains(-1));	//ClassCastException
		//ts.contains(null);	//NullPointerException.
	
		//public E first();
		System.out.println(ts.first());
		System.out.println(ts.last());

		System.out.println(ts.lower("Pranav"));
		System.out.println(ts.lower("Apple"));	//null.
		//Returns the greatest element in this set strictly less than the given element, or null if there is no such element.
		
		System.out.println(ts.floor("Pranav"));
		//Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.

		System.out.println(ts.ceiling("ll"));
		//Returns the least element in this set greater than or equal to the given element, or null if there is no such element.

		System.out.println(ts.higher("ll"));
		//Returns the least element in this set strictly greater than the given element, or null if there is no such element.



	
	}
}
