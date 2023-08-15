import java.util.*;

class UsingTreeSetDemo1{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add("King");
		al.add("Chicken");
		al.add("Apple");
		al.add("Xerox");
		al.add("Xerox");

		System.out.println(al);

		TreeSet ts = new TreeSet(al);
		System.out.println(ts);

	}
}

/*
Drawbacks :
	1. Here two objects are created so heavy operation.
	2. TreeSet do not take similar data so not works in case of similar data.

(to overcome this Collections Class is used)
*/
