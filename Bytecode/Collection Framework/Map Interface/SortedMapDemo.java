import java.util.*;
class SortedMapDemo1{
	public static void main(String[] args){
		SortedMap sm = new TreeMap();

		sm.put("Ind","India");
		sm.put("Pak","Pakistan");
		sm.put("SL","ShiLanka");
		sm.put("Aus","Australia");
		sm.put("Ban","Bangladesh");

		System.out.println(sm);


		//public abstract java.util.SortedMap<K, V> subMap(K, K);
		System.out.println(sm.subMap("Ban","Ind"));
		System.out.println(sm.subMap("Ind","Ind"));
		//System.out.println(sm.subMap("Ind","Ban"));		//Exception in thread "main" java.lang.IllegalArgumentException: fromKey > toKey


		//public abstract java.util.SortedMap<K, V> headMap(K);
		System.out.println(sm.headMap("Aus"));
		System.out.println(sm.headMap("Pak"));


		//public abstract java.util.SortedMap<K, V> tailMap(K);
		System.out.println(sm.tailMap("Aus"));


		//public abstract K firstKey();
		//public abstract K lastKey();
		System.out.println(sm.firstKey());
		System.out.println(sm.lastKey());


		//public abstract java.util.Set<K> keySet();
		System.out.println(sm.keySet());


		//public abstract java.util.Collection<V> values();
		System.out.println(sm.values());


		//public abstract java.util.Set<java.util.Map$Entry<K, V>> entrySet();

		System.out.println(sm.entrySet());
		//[Aus=Australia, Ban=Bangladesh, Ind=India, Pak=Pakistan, SL=ShiLanka]
		//Convert to Set.
	}
}
