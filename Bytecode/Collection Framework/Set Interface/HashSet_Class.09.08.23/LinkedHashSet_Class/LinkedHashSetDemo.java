//insertion order is preserved.

import java.util.*;
class LinkedHashSetDemo{
	public static void main(String[] args){
		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add("Kanha");
		lhs.add("Rahul");
		lhs.add("Ashish");
		lhs.add("Badhe");
		lhs.add("Rahul");
                lhs.add("Ashish");

		System.out.println(lhs);
		lhs.clear();
	}
}
