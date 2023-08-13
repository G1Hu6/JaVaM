import java.util.*;
class HashSetClone{
	public static void main(String[] args){
		HashSet hs = new HashSet();

		hs.add("King");
		hs.add("King");
		hs.add("Apple");
		hs.add("Master");
		hs.add("Zeal");
	
		System.out.println(hs);

		HashSet clone_hs = new HashSet();
		clone_hs = (HashSet)hs.clone();

		System.out.println("New Clonned HashSet =" + clone_hs);
	}
}
