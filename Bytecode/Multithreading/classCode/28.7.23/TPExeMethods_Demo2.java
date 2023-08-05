import java.util.concurrent.*;

class MyThread extends Thread{
	int num;
	static Thread tobj=null;
	MyThread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println("start :"+ num +Thread.currentThread());
		impTask();
		System.out.println("end :"+ num +Thread.currentThread());
	}
	void impTask(){
		try{
			tobj.join();
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class TPMethodDemo{
	public static void main(String[] args){
		ThreadPoolExecutor ser=(ThreadPoolExecutor)Executors.newFixedThreadPool(3);
		for(int i=1;i<=5;i++){
			MyThread obj=new MyThread(i);
			MyThread.tobj=Thread.currentThread();
			ser.execute(obj);
			System.out.println(ser.getTaskCount());
		}
		System.out.println(ser.toString());
		//java.util.concurrent.ThreadPoolExecutor@18b4aac2[Running, pool size = 3, active threads = 3, queued tasks = 2, completed tasks = 0]

		//System.out.println(ser.getPoolSize());	//3

		ser.shutdown();

		System.out.println(ser.toString());
		//java.util.concurrent.ThreadPoolExecutor@18b4aac2[Shutting down, pool size = 3, active threads = 3, queued tasks = 2, completed tasks = 0]

		//System.out.println(ser.getPoolSize());		//3
	}
}
