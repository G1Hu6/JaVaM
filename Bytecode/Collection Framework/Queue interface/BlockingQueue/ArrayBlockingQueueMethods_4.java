import java.util.concurrent.*;
import java.util.*;

class ArrayBlockingQueueMethods_4{
        public static void main(String[] arsg)throws InterruptedException{

		// ArrayBlockingQueue Constructors :

		// 1.ArrayBlockingQueue(int capacity) => Creates an ArrayBlockingQueue with the given (fixed) capacity and default access policy(false).

                BlockingQueue bQueue = new ArrayBlockingQueue(4);
                bQueue.offer(10);
                bQueue.offer(20);
                bQueue.offer(30);
                bQueue.offer(40);

                System.out.println(bQueue);

		// 2.ArrayBlockingQueue(int capacity, boolean fair) =>Creates an ArrayBlockingQueue with the given (fixed) capacity and the specified access policy.
		ArrayList al = new ArrayList();
		al.add("One");
		al.add("Two");

		BlockingQueue bQueue2 = new ArrayBlockingQueue(5, true, al);
		BlockingQueue bQueue3 = new ArrayBlockingQueue(5);

		bQueue2.offer(20);
		bQueue2.offer(20);
		bQueue2.offer(20);
		System.out.println(bQueue2);

		// 3.public E poll();
		bQueue2.poll();
		System.out.println(bQueue2);

		// 4.public E poll(long, java.util.concurrent.TimeUnit) throws java.lang.InterruptedException;
		bQueue3.poll(5, TimeUnit.SECONDS);
                System.out.println(bQueue3);

		// 5.public E peek();
		System.out.println(bQueue2.peek());
		System.out.println(bQueue2);

		// 6.public int size();
		System.out.println(bQueue2.size());

		// 7.public boolean contains(java.lang.Object);
		System.out.println(bQueue2.contains(20));

		// 8.public java.lang.Object[] toArray();
		Object obj[] = bQueue2.toArray();
		for(var data : obj){
			System.out.println(data);
		}

		// 9.public void clear();
		bQueue2.clear();
		System.out.println(bQueue2);
		

	}
}	
