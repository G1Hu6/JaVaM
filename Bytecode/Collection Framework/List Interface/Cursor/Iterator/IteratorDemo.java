import java.util.*;
class IteratorDemo{
	public static void main(String[] args){
		ArrayList obj = new ArrayList();

		obj.add("RunMachine");
		obj.add("King");
		obj.add("SuperV");

		Iterator itr = obj.iterator();

		while(itr.hasNext()){
			if("RunMachine".equals(itr.next()))
				itr.remove();
			System.out.println(itr.next());
		}
		System.out.println(obj);
	}
}
