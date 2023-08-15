/*
import java.util.*;

class MyClass implements Comparable{
	String str = null;
	
	MyClass(String str){
		this.str=str;
	}
	
	public int compareTo(Object obj){
		System.out.println(obj.toString());
		return this.str.compareTo(obj.toString());
	}

	public String toString(){
		return str;
	}
}

class UserTreeSetDemo{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();

		ts.add(new MyClass("C"));
		ts.add(new MyClass("E"));
		ts.add(new MyClass("A"));
		ts.add(new MyClass("B"));

		System.out.println(ts);
	}
}*/

import java.util.*;

class MyClass implements Comparable{
        String str = null;
	static SortedSet ss = null;
	
	MyClass(){
		super();
	}

        MyClass(String str){
                this.str=str;
        }

        public int compareTo(MyClass obj){
                System.out.println(obj.toString());
                return this.str.compareTo((String)obj.str);
        }

        public String toString(){
                return str;
        }
}

class UserTreeSetDemo extends MyClass{
        public static void main(String[] args){
		MyClass.ss = new TreeSet();

                ss.add(new MyClass("C"));
                ss.add(new MyClass("E"));
                ss.add(new MyClass("A"));
                ss.add(new MyClass("B"));

                System.out.println(ss);
        }
}

