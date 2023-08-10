/*
import java.util.*;
class TreeSetDemo{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();

		ts.add(new String("Pranav"));
                ts.add(new String("Suraj"));
                ts.add(new String("Kunal"));
                ts.add(new String("Rushi"));
                ts.add(new String("Suraj"));

		//String class is Comparable.
		//it implements interface Comparable

		System.out.println(ts);
		//Sorted data
	}
}
*/

import java.util.*;
class TreeSetDemo{
        public static void main(String[] args){
                TreeSet ts = new TreeSet();

                ts.add(new StringBuffer("Pranav"));
                ts.add(new StringBuffer("Suraj"));
                ts.add(new StringBuffer("Kunal"));
                ts.add(new StringBuffer("Rushi"));
                ts.add(new StringBuffer("Suraj"));

                //StringBuffer class is Not Comparable.

                System.out.println(ts);
                //Sorted data
        }
}

/*
Before Java 1.10:

 javap java.lang.StringBuffer
Compiled from "StringBuffer.java"
public final class java.lang.StringBuffer extends java.lang.AbstractStringBuilder implements java.io.Serializable,java.lang.CharSequence {

Exception in thread "main" java.lang.ClassCastException: java.lang.StringBuffer cannot be cast to java.lang.Comparable
	at java.util.TreeMap.compare(TreeMap.java:1294)
	at java.util.TreeMap.put(TreeMap.java:538)
	at java.util.TreeSet.add(TreeSet.java:255)
	at TreeSetDemo.main(String_vs_StringBuffer_TreeSetDemo.java:27)

After 1.11:
No Exception Gives Answer.(Implements Comparable)

 */
