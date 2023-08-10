// For our User Defined classes all objects created with new keyword having unique address evenif passing same data

//Repair This Code to accept unique data.
 
import java.util.*;

class MyClass{
	int jerNo=0;
	String pName=null;

	MyClass(int jerNo,String pName){
		this.jerNo=jerNo;
		this.pName=pName;
	}
}
class UserDefined{
	public static void main(String[] args){
		LinkedHashSet hs=new LinkedHashSet();

		hs.add(new MyClass(18,"SuperV"));
		hs.add(new MyClass(45,"Vada-Pav"));
		hs.add(new MyClass(7,"Thala"));
		hs.add(new MyClass(7,"Thala"));

		System.out.println(hs);
		Iterator obj=hs.iterator();
		System.out.println(obj.getClass().getName());
	}
}
