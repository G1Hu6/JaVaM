import java.util.concurrent.*;

class PriorityBlockingQueue1{
        public static void main(String[] arsg)throws InterruptedException{
                BlockingQueue bQueue1 = new PriorityBlockingQueue();	// drfault capacity = 11

                bQueue1.put(10);
                bQueue1.put(90);
                bQueue1.put(50);
                bQueue1.put(30);
                bQueue1.put(20);        
		bQueue1.put(80);     
		bQueue1.put(70); 
		bQueue1.put(40); 
		bQueue1.put(30); 
		bQueue1.put(100); 
		bQueue1.put(109);
	       	bQueue1.put(108);	

                System.out.println(bQueue1);

                BlockingQueue bQueue2 = new PriorityBlockingQueue(4);
                bQueue2.offer("Pranav");
                bQueue2.offer("King");
                bQueue2.offer("Apple");
                bQueue2.offer("Os");

                System.out.println(bQueue2);

                //bQueue2.offer(50);    //No Error
                bQueue2.put(50);	

                System.out.println(bQueue2);
        }
}

