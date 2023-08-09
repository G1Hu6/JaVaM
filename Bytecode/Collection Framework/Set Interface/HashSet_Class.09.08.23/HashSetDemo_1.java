//HashSet is itroduced in Java 1.2.
//It can used to store unique data.

import java.util.*;
class HashSetDemo_1{
	public static void main(String[] args){
		HashSet hs = new HashSet();

		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add(30);
		//In HashSet insertion order is not preserved.
		System.out.println(hs);

	}
}
