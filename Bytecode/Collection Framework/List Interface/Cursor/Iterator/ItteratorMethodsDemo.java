import java.util.*;
class IteratorDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        
        al.add("kanha");
        al.add("ashish");
        al.add("rahul");
        al.add("badhe");
        
        //forEatch loop
        /*for(var x:al){
            System.out.println(x.getClass().getName());
        }*/
        
        //Iterator
        Iterator cursor=al.iterator();
        System.out.println(cursor.getClass().getName());
        
        /*System.out.println(cursor.next());
        System.out.println(cursor.next());
        System.out.println(cursor.next());
        System.out.println(cursor.next());*/
        
        //System.out.println(cursor.next());
        /*
        Exception in thread "main" java.util.NoSuchElementException

at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1000)at IteratorDemo.main(IteratorDemo.java:26)
        */
	
	 //while loop
        while(cursor.hasNext()){
            //System.out.println(cursor.next());
            
            /*if("kanha".equals(cursor.next())){
                cursor.remove();
            }
	    */
	   cursor.next();
           cursor.remove();
        }
        System.out.println(al);	
    }
}
