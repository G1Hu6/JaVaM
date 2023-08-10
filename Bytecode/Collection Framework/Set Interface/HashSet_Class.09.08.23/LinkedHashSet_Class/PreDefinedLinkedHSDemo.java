import java.util.*;

class PreDefinedDemo{
	public static void main(String[] args){
		LinkedHashSet hs = new LinkedHashSet();

		hs.add(10);			//new Integer(10)
		hs.add(20);			//new Integer(20)	//Internally
		hs.add(new Integer(10));
		hs.add(new Integer(20));

		//Here all the objects are created with new keyword so all goes as new objects but Java handle this code for Pre Defined class.
		System.out.println(hs);
	}
}
