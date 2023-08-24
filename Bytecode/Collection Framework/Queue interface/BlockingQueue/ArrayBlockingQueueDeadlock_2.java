/*
import java.util.concurrent.*;

class ArrayBlockingQueue1{
	public static void main(String[] arsg){
		//BlockingQueue bQueue = new ArrayBlockingQueue();
		//error: no suitable constructor found for ArrayBlockingQueue(no arguments)
		
		BlockingQueue bQueue = new ArrayBlockingQueue(4);
		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);
		bQueue.offer(40);
		
		System.out.println(bQueue);
		
		bQueue.put(50);	// Throws InterruptedException to notify.
				//error: unreported exception InterruptedException; must be caught or declared to be thrown
		
		System.out.println(bQueue);
	}
}
*/

import java.util.concurrent.*;

class ArrayBlockingQueue1{
        public static void main(String[] arsg)throws InterruptedException{
                //BlockingQueue bQueue = new ArrayBlockingQueue();
                //error: no suitable constructor found for ArrayBlockingQueue(no arguments)

                BlockingQueue bQueue = new ArrayBlockingQueue(4);
                bQueue.offer(10);
                bQueue.offer(20);
                bQueue.offer(30);
                bQueue.offer(40);

                System.out.println(bQueue);

                bQueue.put(50); 
            
		System.out.println(bQueue);
        }
}

//Deadlock Case.(cursor blinks forever)
//Queue is blocked if we add data more than size.
//to avoid case of deadlock we have to use two threads.
