import java.util.concurrent.*;

class MyThread implements Runnable{
	int num;
	MyThread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println("start :" + Thread.currentThread() +num);
		dailyTask();
		System.out.println("end :" + Thread.currentThread() +num);
	}
	void dailyTask(){
		try{
			Thread.sleep(10000);
		}catch(InterruptedException ie){
		
		}
	}
}

class TPDemo{
	public static void main(String[] args){
		//ThreadPoolExecutor es=Executors.newCachedThreadPool(); 
		//error:incompatible types: ExecutorService cannot be converted to ThreadPoolExecutor.

		ThreadPoolExecutor es=(ThreadPoolExecutor)Executors.newCachedThreadPool();
		for(int i=0;i<=8;i++){
			MyThread obj=new MyThread(i);
			es.execute(obj);
		}
		es.shutdown();
	}
}
