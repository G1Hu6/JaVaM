import java.util.concurrent.*;

class ArrayBlockingQueue1{
        public static void main(String[] arsg){
                BlockingQueue bQueue = new ArrayBlockingQueue(4);
                bQueue.offer(10);
                bQueue.offer(20);
                bQueue.offer(30);
                bQueue.offer(40);

                System.out.println(bQueue);
		
		try{
                	bQueue.put(50); // Throws InterruptedException to notify.
		}catch(InterruptedException ie){
			System.out.println("Blocked.....");	// Does not println
		}

                System.out.println(bQueue);
        }
}

