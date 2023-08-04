import java.util.*;
class ArrayListDemo_1{
	public static void main(String[] args){
		ArrayList al=new ArrayList();

		//1.void add(E);
		al.add(10);
		al.add(90.99f);
		al.add("KingVK");
		al.add(90.99f);

		//2. public int size();
		System.out.println(al.size());

		//3. public boolean contains(java.lang.Object);
		System.out.println(al.contains("KingVK"));	//true
		System.out.println(al.contains(99));		//false

		//4. public int indexOf(java.lang.Object);
		System.out.println(al.indexOf(10));	//0
		System.out.println(al.indexOf(10.90));	//-1
		
		//5. public int lastIndexOf(java.lang.Object); 
		System.out.println(al.lastIndexOf(90.99f));
		System.out.println(al.lastIndexOf("PPP"));

		//6. public E get(int);
			//System.out.println(al.get(4));
			/*
			 Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
				at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
				at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
				at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
				at java.base/java.util.Objects.checkIndex(Objects.java:385)
				at java.base/java.util.ArrayList.get(ArrayList.java:427)
				at ArrayListDemo_1.main(ArrayListMethodsDemo.java:28)
			*/
		System.out.println(al.get(1));
		
		//7. public E set(int, E);
		//System.out.println(al.set(4,"Master"));		//IndexOutOfBoundsException: Index 4 out of bounds for length 4
		System.out.println(al.set(3,"Master"));		//it can print replaced object.
		System.out.println(al);
	}
}
