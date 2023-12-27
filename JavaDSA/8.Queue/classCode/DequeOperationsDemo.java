import java.util.*;

class DequeOperationsDemo{

	public static void main(String[] args){
	
		//Deque dq = new Deque(); //  error: Deque is abstract; cannot be instantiated
		Deque<Integer> dq = new ArrayDeque<Integer>(5);

		dq.addFirst(10);
		dq.addFirst(20);
		dq.addFirst(30);
		dq.addFirst(40);
		dq.addFirst(50);
		System.out.println(dq);
		dq.addFirst(60);
		System.out.println(dq);

		System.out.println(dq);
		System.out.println(dq.removeFirst());
		System.out.println(dq);
		System.out.println(dq.removeLast());
		System.out.println(dq);
	}
}
