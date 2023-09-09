import java.util.concurrent.*;

class LinkedBlockingQueue1{
        public static void main(String[] arsg)throws InterruptedException{
                BlockingQueue bQueue1 = new LinkedBlockingQueue();
		
		bQueue1.put(10);
		bQueue1.put(10);
		bQueue1.put(10);
		bQueue1.put(10);
		bQueue1.put(10);	//put() method does not wait for this constructor.

		System.out.println(bQueue1);
               
                BlockingQueue bQueue2 = new LinkedBlockingQueue(4);
                bQueue2.offer(10);
                bQueue2.offer(20);
                bQueue2.offer(30);
                bQueue2.offer(40);

                System.out.println(bQueue2);
		
		//bQueue2.offer(50);	//No Error
                bQueue2.put(50); 
            
		System.out.println(bQueue2);
        }
}
