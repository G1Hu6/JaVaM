import java.util.concurrent.*;

class Producer implements Runnable{
	BlockingQueue bQueue = null;

	Producer(BlockingQueue bQueue){
		this.bQueue = bQueue;
	}
	public void run(){
		for(int i = 0; i <= 10; i++){
			try{
				bQueue.put(i);
				System.out.println("Produce :" + i);
			}catch(InterruptedException ie){
			
			}

			try{
				Thread.sleep(7000);
			}catch(InterruptedException ie){
			
			}
		}
	}
}

class Consumer implements Runnable{
        BlockingQueue bQueue = null;

        Consumer(BlockingQueue bQueue){
                this.bQueue = bQueue;
        }
        public void run(){
                for(int i = 0; i <= 10; i++){
                        try{
                                bQueue.take();
                                System.out.println("Consume :" + i);
                        }catch(InterruptedException ie){

                        }

                        try{
                                Thread.sleep(7000);
                        }catch(InterruptedException ie){

                        }
                }
        }
}

class ProducerConsumer{
	public static void main(String[] args){
		BlockingQueue bQueue = new ArrayBlockingQueue(3);

		Producer produce = new Producer(bQueue);
		Consumer consume = new Consumer(bQueue);

		new Thread(produce).start();
		new Thread(consume).start();
	}
}
