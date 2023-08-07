import java.util.*;
class ALUsingFor{
	public static void main(String[] args){
		ArrayList al=new ArrayList();

		al.add(10);
		al.add(new Integer(20));
		al.add(20);
		al.add(10);

		System.out.println(al);

//Drawbacks:
		//Accessing ArrayList using for loop is rigid.
		//Here we cannot get objects seperately with its data type
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}

		/*
		for(Integer obj:al){
			//error:incompatible types: Object is cannot be converted to Integer.

			System.out.println(obj);
		}
		*/
		
		for(var obj:al){
                        System.out.println(obj);
                }
		/*	Before Java 1.10:

		error: cannot find symbol
			for(var obj:al){
		    	    ^
	 	symbol:   class var
  		location: class ALUsingFor
		Note: AccessArrayListUsingFor.java uses unchecked or unsafe operations.
		Note: Recompile with -Xlint:unchecked for details.
		1 error

		 */
		
		for(Object obj:al){
			System.out.println(obj);
		}
	}
}

// To overcome this drawback Cursor is introduced.
