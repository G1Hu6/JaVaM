import java.util.concurrent.*;
import java.util.*;

class BlockingQueueMethods{
        public static void main(String[] arsg)throws InterruptedException{
                //BlockingQueue bQueue = new ArrayBlockingQueue();
                //error: no suitable constructor found for ArrayBlockingQueue(no arguments)

                BlockingQueue bQueue = new ArrayBlockingQueue(4);
                
	// 1.public abstract boolean add(E);
		
		//bQueue.add(null);	//Exception in thread "main" java.lang.NullPointerException

		//bQueue.add(10);
		//bQueue.add("String");
		//System.out.println(bQueue.add(50));	// true
							//returning true upon success and throwing an IllegalStateException if no space is currently available
	

	// 2.public abstract boolean offer(E);
                bQueue.offer(20);
                bQueue.offer(30);
                bQueue.offer(40);
		bQueue.offer(40);
		//bQueue.offer(40);

                System.out.println(bQueue);
		System.out.println(bQueue.remainingCapacity());

		//bQueue.add(50);		//Exception in thread "main" java.lang.IllegalStateException: Queue full


	// 3.public abstract boolean offer(E, long, java.util.concurrent.TimeUnit) throws java.lang.InterruptedException;
                bQueue.offer(50 ,5 ,TimeUnit.SECONDS);	//main thread sleeps for 5 sec. 
            	//Inserts the specified element into this queue, waiting up to the specified wait time if necessary for space to become available.		
		System.out.println(bQueue);

		ArrayList al = new ArrayList();
		System.out.println("ArrayList ="+al);

	// 4.public abstract int drainTo(java.util.Collection<? super E>);
		bQueue.drainTo(al);

		System.out.println("ArrayList ="+al);
		System.out.println(bQueue);

	// 5. public abstract E take() throws java.lang.InterruptedException;
		BlockingQueue bQueue2 = new ArrayBlockingQueue(4);
		bQueue2.remove(10);	//If Queue is empty then nither throw error nor wait.
		
	// 6.public abstract E take() throws java.lang.InterruptedException;
		//bQueue2.take();	//wait untill the element is added in Queue.
	
	// 7.public abstract int remainingCapacity();
		System.out.println(bQueue.remainingCapacity());	        //4 (Because of using the drainTo() method bQueue becomes empty)
		System.out.println(bQueue2.remainingCapacity());	//4

	// 8.public abstract E poll(long, java.util.concurrent.TimeUnit) throws java.lang.InterruptedException;
		//Retrieves and removes the head of this queue, waiting up to the specified wait time if necessary for an element to become available.


        }
}
