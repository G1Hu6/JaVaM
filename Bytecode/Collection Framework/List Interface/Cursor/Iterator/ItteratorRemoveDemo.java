import java.util.*;
class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        
        al.add("kanha");
        al.add("ashish");
        al.add("rahul");
        al.add("badhe");

	Iterator cursor=al.iterator();
	//while loop
        while(cursor.hasNext()){
           //cursor.remove();
	   /*
	    Exception in thread "main" java.lang.IllegalStateException
	at java.util.ArrayList$Itr.remove(ArrayList.java:874)
	at IteratorDemo.main(ItteratorRemoveDemo.java:14)
	    */
		if("kanha".equals(cursor.next()))
			cursor.remove();
		System.out.println(cursor.next());
        }

	//cursor.remove();	//Exception in thread "main" java.lang.IllegalStateException
        System.out.println(al);
    }
}
  
