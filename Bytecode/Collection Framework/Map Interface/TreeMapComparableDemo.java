/*
import java.util.*;

class Platform{
	String str = null;
	int foundYear = 0;

	Platform(String str,int foundYear){
		this.str = str;
		this.foundYear = foundYear;
	}

	public String toString(){
		return "(" + str + ":" + foundYear + ")";
	}
}

class TreeMapComparableDemo{
	public static void main(String[] args){
		TreeMap tm = new TreeMap();

		tm.put(new Platform("Youtube",2005),"Google");
		tm.put(new Platform("Instagram",2013),"Meta");
		tm.put(new Platform("Facebook",2004),"Meta");
		tm.put(new Platform("ChatGPT",2022),"OpenAI");

		System.out.println(tm);
	}
}

//Exception in thread "main" java.lang.ClassCastException: class Platform can not cast into java.lang.Comparable
/*(Platform is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
	at java.base/java.util.TreeMap.compare(TreeMap.java:1569)
	at java.base/java.util.TreeMap.addEntryToEmptyMap(TreeMap.java:776)
	at java.base/java.util.TreeMap.put(TreeMap.java:785)
	at java.base/java.util.TreeMap.put(TreeMap.java:534)
	at TreeMapComparableDemo.main(TreeMapComparableDemo.java:21)
*/

import java.util.*;

class Platform implements Comparable{
        String str = null;
        int foundYear = 0;
	static SortedMap sm = null;

        Platform(String str,int foundYear){
                this.str = str;
                this.foundYear = foundYear;
        }

	public int compareTo(Object obj){
		//return foundYear - (((Platform)obj).foundYear);

		return str.compareTo(((Platform)obj).str);
	}
        public String toString(){
                return "(" + str + ":" + foundYear + ")";
        }
}

class TreeMapComparableDemo{
        public static void main(String[] args){
                TreeMap tm = new TreeMap();
		Platform.sm = tm;

                tm.put(new Platform("Youtube",2005),"Google");
                tm.put(new Platform("Instagram",2013),"Meta");
                tm.put(new Platform("Facebook",2004),"Meta");
                tm.put(new Platform("ChatGPT",2022),"OpenAI");

                System.out.println(tm);
        }
}
