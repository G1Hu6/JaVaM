import java.util.*;
class TreeSetDemo{
	public static void main(String[] args){
		TreeSet ts = new TreeSet();

		ts.add(30);
		ts.add(90);
		ts.add(40);
		ts.add(10);
		ts.add(10);
		
		ts.clear();

		ts.add("Pranav");
                ts.add("Suraj");
                ts.add("Kunal");
                ts.add("Rushi");
                ts.add("Suraj");

		System.out.println(ts);
		//Sorted data
	}
}
