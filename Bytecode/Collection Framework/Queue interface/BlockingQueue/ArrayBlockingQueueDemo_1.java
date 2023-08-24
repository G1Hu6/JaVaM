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
		bQueue.offer(50);	//No Error No changes in Output.
		System.out.println(bQueue);
	}
}
