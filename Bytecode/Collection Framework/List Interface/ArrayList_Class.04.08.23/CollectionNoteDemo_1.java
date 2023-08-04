import java.util.*;
class CollectionNoteDemo{
	public static void main(String[] args){
		List obj=new ArrayList();
		//List<E> obj=new ArrayList<E>();	// Here we can not add Generics Element so it gives a Note.
							// Output is produced after Note and warning.

		obj.add(10);
		obj.add(20);
		obj.add(20);
		System.out.println(obj);
	}
}
/*
 * Before Java 1.17 :-
 *java CollectionNoteDemo_1.java  &  javac CollectionNoteDemo_1.java

Note: CollectionNoteDemo_1.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.


--------------------------------------------------------------------------------------------------------------------------------------------------------------
 * After :-
 * java CollectionNoteDemo_1.java

CollectionNoteDemo_1.java:7: warning: [unchecked] unchecked call to add(E) as a member of the raw type List
		obj.add(10);
		       ^
  where E is a type-variable:
    E extends Object declared in interface List
CollectionNoteDemo_1.java:8: warning: [unchecked] unchecked call to add(E) as a member of the raw type List
		obj.add(20);
		       ^
  where E is a type-variable:
    E extends Object declared in interface List
CollectionNoteDemo_1.java:9: warning: [unchecked] unchecked call to add(E) as a member of the raw type List
		obj.add(20);
		       ^
  where E is a type-variable:
    E extends Object declared in interface List
3 warnings
*/
