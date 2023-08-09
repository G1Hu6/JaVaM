import java.util.*;
class HashSetDemo_2{
        public static void main(String[] args){
                HashSet hs = new HashSet();
		// default initial capacity (16) and load factor (0.75)

                hs.add("Pikachu");
                System.out.println(hs.add("Charmainder"));	//true
                hs.add("Mew");
		System.out.println(hs.add("Charmainder"));	//false (data is not added to HashSet)
                hs.add("Ho-ho");
                //In HashSet insertion order is not preserved.
                System.out.println(hs);
		
		Iterator itr = hs.iterator();
		System.out.println(itr.getClass().getName());

		/*System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		//System.out.println(itr.next());	//Exception in thread "main" java.util.NoSuchElementException*/

		while(itr.hasNext()){
			//itr.remove();		//IllegalStateException
			System.out.println(itr.next());
		}

		//public boolean remove(java.lang.Object);
		hs.remove(10);	//No Error
		hs.remove("Mew");
		System.out.println(hs);

		//public java.lang.Object[] toArray();
		Object arr[]=hs.toArray();
		for(var a:arr){
			System.out.println(a);
		}

		System.out.println(hs.contains("Ho-ho"));	//true
		System.out.println(hs.isEmpty());	//false
		System.out.println(hs.size());
        }
}

