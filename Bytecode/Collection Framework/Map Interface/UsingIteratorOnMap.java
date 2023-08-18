import java.util.*;

class UsingIteratorInMap{
	public static void main(String[] args){
		TreeMap tm = new TreeMap();

		tm.put("Ind","India");
		tm.put("Pak","Pakistan");
		tm.put("SL","ShiLanka");
		tm.put("Aus","Australia");
		tm.put("Ban","Bangladesh");

		System.out.println(tm);

		Set data = tm.entrySet();
		Iterator itr = data.iterator();
		//System.out.println(data);
		//var obj = data.get(0);
	       	//System.out.println(obj.getClass().getName());	
		var obj1 = itr.next();
		System.out.println(obj1.getClass().getName());
		while(itr.hasNext()){
			System.out.println(((Map.Entry)itr.next()).getKey());
		}
	}
}
