import java.util.*;

class IntInternals{
	public static void main(String[] args){
		HashMap hm = new HashMap();
		int a = 112;
		int b = 111;
		int c = 110;
		hm.put(new Integer(110),"Microsoft");
		hm.put(new Integer(111),"Gold");
		hm.put(new Integer(112),"Apple");

		System.out.println(hm);
	}
}
