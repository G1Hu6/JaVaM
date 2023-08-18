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

class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){
		return ((Platform)obj1).str.compareTo(((Platform)obj2).str);
	}
}

class TreeMapComparableDemo{
        public static void main(String[] args){
                TreeMap tm = new TreeMap();
             
                tm.put(new Platform("Youtube",2005),"Google");
                tm.put(new Platform("Instagram",2013),"Meta");
                tm.put(new Platform("Facebook",2004),"Meta");
                tm.put(new Platform("ChatGPT",2022),"OpenAI");

		Collections.sort(tm ,new SortByName());
		// use constructor of TreeMap which has comparator has parameter.

                System.out.println(tm);
        }
}

TreeMapComparatorDemo.java:32: error: no suitable method found for sort(TreeMap,SortByName)
		Collections.sort(tm ,new SortByName());
		           ^
    method Collections.<T#1>sort(List<T#1>) is not applicable
      (cannot infer type-variable(s) T#1
        (actual and formal argument lists differ in length))
    method Collections.<T#2>sort(List<T#2>,Comparator<? super T#2>) is not applicable
      (cannot infer type-variable(s) T#2
        (argument mismatch; TreeMap cannot be converted to List<T#2>))
  where T#1,T#2 are type-variables:
    T#1 extends Comparable<? super T#1> declared in method <T#1>sort(List<T#1>)
    T#2 extends Object declared in method <T#2>sort(List<T#2>,Comparator<? super T#2>)
Note: TreeMapComparatorDemo.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
1 error
*/

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

class SortByName implements Comparator{
        public int compare(Object obj1,Object obj2){
                return ((Platform)obj1).str.compareTo(((Platform)obj2).str);
        }
}

class TreeMapComparatorDemo{
        public static void main(String[] args){
                TreeMap tm = new TreeMap(new SortByName());

                tm.put(new Platform("Youtube",2005),"Google");
                tm.put(new Platform("Instagram",2013),"Meta");
                tm.put(new Platform("Facebook",2004),"Meta");
                tm.put(new Platform("ChatGPT",2022),"OpenAI");

                System.out.println(tm);
        }
}

