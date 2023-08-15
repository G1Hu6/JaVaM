import java.util.*;

class ArrayListDemo4{
	public static void main(String[] args){
		//ArrayList al=new ArrayList();	//Constructs an empty list with an initial capacity of ten.
		
		ArrayList<Integer> al=new ArrayList<Integer>(2);	//Constructs an empty list with the specified initial capacity.

		/*
		al.add("Os");
		al.add(new StringBuffer("King"));
		al.add(10);
		al.add(10.99);
		al.add(10.99);
		al.add(new StringBuffer("Shashi"));
		al.add(new Integer(10));
*/
		System.out.println(al);

		// 1.public void trimToSize(); 
		// Trims the capacity of this ArrayList instance to be the list's current size.
		al.trimToSize();	

		// 2.ensureCapacity(int);
		// Increases the capacity of this ArrayList instance, if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
		al.ensureCapacity(20);

		// 3.public java.lang.Object clone();
		ArrayList clone_al = (ArrayList)al.clone();

		System.out.println(clone_al);
		al.clear();

		al.add(20);
		al.add(30);
		al.add(90);
		al.add(23);

		// 4.public boolean removeIf(java.util.function.Predicate<? super E>);
		al.removeIf(n -> (n % 3==0));
		System.out.println(al);


	}
}
