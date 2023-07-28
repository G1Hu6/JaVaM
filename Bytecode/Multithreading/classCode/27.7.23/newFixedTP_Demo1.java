// ThreadPool is used to manage our own servers.
// to create Thread everytime is Heavy Task so we can use ThreadPool

//Executor is Base in Interface to manage ThreadPool and user.
//Executors is Base Class used to create ThreadPool.


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
			Thread.sleep(1000);
		}catch(InterruptedException ie){
		
		}
	}
}

class TPDemo{
	public static void main(String[] args){
		ExecutorService es=Executors.newFixedThreadPool(5);

		for(int i=0;i<=8;i++){
			MyThread obj=new MyThread(i);
			es.execute(obj);
		}
		es.shutdown();
	}

	//After execution we have to shutdown ThreadPool because after execution all Threads in Pool are alive in search of next Task.
}
