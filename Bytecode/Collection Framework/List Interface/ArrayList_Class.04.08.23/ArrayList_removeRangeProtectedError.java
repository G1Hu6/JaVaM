/*
import java.util.*;
class ArrayListDemo_3{
        public static void main(String[] args){
                ArrayList al=new ArrayList();

                al.add(10);
                al.add(90.99f);
                al.add("KingVK");
                al.add(90.99f);

		al.removeRange(1,3);	//Error.java:11: error: removeRange(int,int) has protected access in ArrayList
	}
}
------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
class ArrayListDemo_3 extends ArrayList{
        public static void main(String[] args){
                ArrayList al=new ArrayList();

                al.add(10);
                al.add(90.99f);
                al.add("KingVK");
                al.add(90.99f);

                al.removeRange(1,3);    //Error.java:11: error: removeRange(int,int) has protected access in ArrayList
        }
}
*/

import java.util.*;
class ArrayListDemo_3 extends ArrayList{
        public static void main(String[] args){
                ArrayListDemo_3 al=new ArrayListDemo_3();

                al.add(10);
                al.add(90.99f);
                al.add("KingVK");
                al.add(90.99f);

                al.removeRange(1,3);	//(1,3-1)  
		al.removeRange(1,9);			//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: arraycopy: length -9 is negative
	       System.out.println(al);	
        }
}

