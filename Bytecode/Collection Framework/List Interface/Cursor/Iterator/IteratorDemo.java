//Iterator(Universal Cursor)

//getClass() method is present in Object class.
//this is present in java.lang.Class

import java.util.*;
class IteratorDemo{
	public static void main(String[] args){
		ArrayList obj = new ArrayList();

		obj.add("RunMachine");
		obj.add("King");
		obj.add("SuperV");

		Iterator itr = obj.iterator();
		//Iterator is changes its type to on which it is called.

		while(itr.hasNext()){
			if("RunMachine".equals(itr.next()))
				itr.remove();
			System.out.println(itr.next());
		}
		System.out.println(obj);
	}
}

//all the methodes are present in Iterator interface are whithout body.

//even if calling these methodes in our class cannot give error because body for these methodes is given in Innerclass Itr

//ArrayList$Itr
