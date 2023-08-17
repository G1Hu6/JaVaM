import java.util.*;

class HashMapDemo{
	public static void main(String[] args){
		HashMap hm = new HashMap();

		hm.put("Java",".java");
		hm.put("Dart",".dart");
		hm.put("Python",".py");

		System.out.println(hm);
		System.out.println(hm.get("Python"));

		System.out.println(hm.keySet());

		System.out.println(hm.values());

		System.out.println(hm.entrySet());	//Converts to set
	}
}
