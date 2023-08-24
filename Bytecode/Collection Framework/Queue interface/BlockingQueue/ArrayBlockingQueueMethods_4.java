import java.util.concurrent.*;
import java.util.*;

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

                bQueue.offer(50 ,5 ,TimeUnit.SECONDS);	//main thread sleeps for 5 sec. 
            
		System.out.println(bQueue);

		ArrayList al = new ArrayList();
		System.out.println("ArrayList ="+al);

		bQueue.drainTo(al);

		System.out.println("ArrayList ="+al);
		System.out.println(bQueue);
        }
}
