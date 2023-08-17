import java.util.*;

class DuplicateKeyValueDemo{
	public static void main(String[] args){
		HashMap hm = new HashMap();
		HashMap hm1 = new HashMap();

		//Duplicates values are allowed in HashMap.

		hm.put("Virat",18);
		hm.put("Rohit",45);
		hm.put("Dhoni",7);
		hm.put("Mahi",7);

		System.out.println(hm);

		//Duplicates key are not allowed.it can not throw error but values must be updated.
		
		hm1.put("Virat",18);
                System.out.println(hm1.put("Virat","One8"));	//return deleated value.
                hm1.put("Dhoni",7);
                hm1.put("Mahi",7);

		System.out.println(hm1);
	}
}
