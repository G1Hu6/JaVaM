import java.util.*;
class ArrayListDemo_2{
        public static void main(String[] args){
                ArrayList al=new ArrayList();

                al.add(10);
                al.add(90.99f);
                al.add("KingVK");
                al.add(90.99f);

		//public E remove(int);
		System.out.println(al.remove(0));

		//public boolean addAll(java.util.Collection<? extends E>);
		ArrayList al2=new ArrayList();

                al2.add("Amir");
                al2.add("Khan");
                al2.add("Sallubhaii");
		
		al.addAll(al2);

		//public boolean addAll(int, java.util.Collection<? extends E>);
		al.addAll(2,al2);
		
		//public <T> T[] toArray(T[]);
		Object arr[]=al.toArray();
		System.out.println(arr);		//Hash Code	[Ljava.lang.Object;@251a69d7
		
		for(Object a:arr){
			System.out.print(a +" ");
		}

		//clear();
		al.clear();
		System.out.println(al);		//[]

	}
}
