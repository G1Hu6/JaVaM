//import java.util.LinkedList;
//import java.util.ArrayList;

import java.util.*;

class LinkedListMethodes extends LinkedList{
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		
		//public boolean add(E);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		LinkedList ll = new LinkedList(al);
		System.out.println(ll);

		//ll.linkLast(20);	//error: linkLast(E) is not public in LinkedList; cannot be accessed from outside package

		// 1.public E getFirst();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.removeFirst());
		System.out.println(ll);
		System.out.println(ll.removeLast());
		System.out.println(ll);
		

		// 2.public void addFirst(E);
		ll.addFirst(10);
		ll.addLast(40);
		System.out.println(ll);


		// 3.public boolean contains(java.lang.Object);
		System.out.println(ll.contains(10));
		System.out.println(ll.contains(90));


		// 4.public E peek();
		//   public E element();
		// Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(ll.peek());


		// 5.public E peekFirst();
		//Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
		System.out.println(ll.peekFirst());


		// 6.public E peekLast();
		// Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
		System.out.println(ll.peekLast());


		//public E poll();
		//Retrieves and removes the head (first element) of this list
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());

		//public boolean offer(E);
		//Adds the specified element as the tail (last element) of this list.

		//public boolean offerFirst(E);
		//Inserts the specified element at the front of this list.

		//public boolean offerLast(E);
		//Inserts the specified element at the end of this list.


		System.out.println(ll.pop());
		System.out.println(ll);

	}
}
