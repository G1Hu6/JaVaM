import java.util.*;

class VectorConstructorDemo_2{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add("Flutter");
		al.add("Dart");
		//al.add("Hackthon");

		Vector v = new Vector(5);	//construct vector with initial capacity as 5 with zero capacity Incremect.
		//v = new Vector(al);
			
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);

		v = new Vector(al);	
		System.out.println(v);
	}
}
