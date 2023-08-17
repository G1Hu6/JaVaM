import java.util.*;

class IdentityHashMapDemo{
	public static void main(String[] args){
		HashMap hm = new HashMap();
		hm.put(1,"King");
		hm.put(1,"King");
		hm.put(18,"VK");	
		hm.put(7,"Mahi");
		
		System.out.println(hm);
		
		IdentityHashMap hl = new IdentityHashMap();
		hl.put(1,"King");
                hl.put(1,"King");
                hl.put(18,"VK"); 
                hl.put(7,"Mahi");	
		System.out.println(hl);

		IdentityHashMap h = new IdentityHashMap();
		h.put(new Integer(10),"King");
                h.put(new Integer(10),"Solger");
                h.put(new Integer(18),"VK");
                h.put(new Integer(7),"Mahi");
                System.out.println(h);

	}
}
