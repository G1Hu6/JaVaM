import java.util.*;

class DequeDemo{
	public static void main(String[] args){
		Deque q = new ArrayDeque();

		q.add(10);
		q.add(40);
		q.add(20);
		q.add(30);

		System.out.println(q);

		//public abstract boolean offerFirst(E);
 		//public abstract boolean offerLast(E);
		q.offerFirst(5);
		q.offerLast(50);
		System.out.println(q);


		//public abstract E pollFirst();
  		//public abstract E pollLast();
		q.pollFirst();
		q.pollLast();
		System.out.println(q);


		//public abstract E peekFirst();
  		//public abstract E peekLast();
		q.peekFirst();
		q.peekLast();
		System.out.println(q);


		//  public abstract java.util.Iterator<E> iterator();
  		//public abstract java.util.Iterator<E> descendingIterator();
		Iterator itr = q.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		// decendingIterator
		Iterator itr1 = q.descendingIterator();
		while(itr1.hasNext()){
                        System.out.println(itr1.next());
                }
	}
}


