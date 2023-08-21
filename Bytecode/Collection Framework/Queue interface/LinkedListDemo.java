
import java.util.*;

class QueueChildLinkedListDemo{
	public static void main(String[] args){
		Queue que = new LinkedList();
		// Here it does not throw error because Queue is GrandParent of LinkedList.

		// 1.public abstract boolean offer(E);
		que.offer(10);
		que.offer(50);
		que.offer(50);
		que.offer(30);
		que.offer(20);

		System.out.println(que);

		// 2.public abstract boolean add(E);
		que.add("King");
	

		// 3.public abstract E poll();	//Retrieves and removes the head of this queue, or returns null if this queue is empty.
		que.poll();			

		
		// 4.public abstract E remove();
		que.remove();			//throws NoSuchElementException when queue is empty.
		System.out.println(que);


		// 5.public abstract E peek();	//Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		System.out.println(que.peek());

		
		// 6. public abstract E element();
		System.out.println(que.element());//throws NoSuchElementException when queue is empty.
		System.out.println(que);
	}
}

/*

import java.util.*;

class QueueChildLinkedListDemo{
        public static void main(String[] args){
                Queue que = new LinkedList();
            
                System.out.println(que);

                que.poll();

               // que.remove();              
	     	/*
		 Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
	at java.base/java.util.LinkedList.remove(LinkedList.java:689)
	at QueueChildLinkedListDemo.main(LinkedListDemo.java:53)

		 */	
                //System.out.println(que);

                //System.out.println(que.peek());		//null

                //System.out.println(que.element());
		/*
		 Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
	at java.base/java.util.LinkedList.remove(LinkedList.java:689)
	at QueueChildLinkedListDemo.main(LinkedListDemo.java:53)
		 */

                /*System.out.println(que);
        }
}

*/
