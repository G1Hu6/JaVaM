import java.util.*;

class ArrayListDemo4{
	public static void main(String[] args){
		//ArrayList al=new ArrayList();	//Constructs an empty list with an initial capacity of ten.
		
		ArrayList al=new ArrayList(2);	//Constructs an empty list with the specified initial capacity.

		al.add("Os");
		al.add(new StringBuffer("King"));
		al.add(10);
		al.add(new Integer(10));

		System.out.println(al);
	}
}
