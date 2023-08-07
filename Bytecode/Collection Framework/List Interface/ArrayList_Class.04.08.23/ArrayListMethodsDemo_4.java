import java.util.*;

class ArrayListDemo4{
	public static void main(String[] args){
		ArrayList al=new ArrayList(2);
		
		al.add("Os");
		al.add(new StringBuffer("King"));
		al.add(10);
		al.add(new Integer(10));

		System.out.println(al);
	}
}
