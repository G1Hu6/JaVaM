import java.util.*;
class LinkedMethodsDemo{
	public static void main(String[] args){
		LinkedHashSet lhs = new LinkedHashSet(12);

		lhs.add(10);
		lhs.add(29);
		lhs.add(29);
		lhs.add(30);
		lhs.add(40);

		System.out.println(lhs);
		System.out.println(lhs.isEmpty());

		System.out.println(lhs.size());

		LinkedHashSet clonelsh = new LinkedHashSet();
		//clonelsh = lhs.clone();
		// error: incompatible types: Object cannot be converted to LinkedHashSet

		clonelsh = (LinkedHashSet)lhs.clone();

		System.out.println("New Clonned LinkedHashSet =");
		System.out.println(clonelsh);
	}
}
