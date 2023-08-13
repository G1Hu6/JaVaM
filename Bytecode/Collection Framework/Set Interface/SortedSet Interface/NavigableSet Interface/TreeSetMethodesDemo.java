import java.util.*;

class TreeSetMethodesDemo{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();
/*
		ts.add("Mac");
		ts.add("Apple");
		ts.add(18);
		ts.add("Str");
*/
		ts.add("Mac");
                ts.add("Apple");
                ts.add("King");
                ts.add("ll");

		Iterator cursor = ts.iterator();
		System.out.println(cursor.getClass().getName());
/*
		Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	at java.base/java.lang.Integer.compareTo(Integer.java:59)
	at java.base/java.util.TreeMap.put(TreeMap.java:566)
	at java.base/java.util.TreeSet.add(TreeSet.java:255)
	at TreeSetMethodesDemo.main(TreeSetMethodesDemo.java:9)
*/
	}
}
