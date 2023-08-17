// key and value pairs.
import java.util.*;

class HashMapDemo{
	public static void main(String[] args){
		HashMap hm = new HashMap();

		hm.put("KUNAL","Microsoft");
		hm.put("SURAJ","Gold");
		hm.put("TANMAY","Apple");

		System.out.println(hm);

		// HashSet also produce same output because it uses internallyHashMap.
		HashSet hs = new HashSet();

		hs.add("KUNAL");
		hs.add("SURAJ");
		hs.add("TANMAY");

		System.out.println(hs);
	}
}
