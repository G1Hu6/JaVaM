import java.util.*;

class VectorMthodesDemo{
	public static void main(String[] args){
		Vector v = new Vector();

		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);

		// 1.public synchronized void copyInto(java.lang.Object[]);
		Integer anArray[] = new Integer[4];

		v.copyInto(anArray);
		for(var x:anArray){
			System.out.println(x);
		}


	}
}
