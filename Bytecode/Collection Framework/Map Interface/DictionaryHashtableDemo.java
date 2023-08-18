import java.util.*;

class Hashtable{
	public static void main(String[] args){
		Hashtable ht = new Hashtable();
		
		ht.put(10,"Sachin");
		ht.put(7,"MSD");
		ht.put(18,"Virat");
		ht.put(1,"KLRahul");
		ht.put(45,"Rohit");

		System.out.println(ht);

		Dictionary d = new Hashtable();
		Enumaration itr1 = ht.keys();
		while(itr1.hasMoreElements()){
			System.out.println(itr1.nextElments());
		}

		Enumaration itr2 = ht.keys();
                while(itr2.hasMoreElements()){
                        System.out.println(itr1.nextElments());
                }
		System.out.println(ht.get(10));
		ht.remove(1);
		System.out.println(ht);
	}
}
