class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			System.out.println(ie);
		}
	}
}

class TG_RunnableDemo{
	public static void main(String[] args){
		ThreadGroup pThreadG=new ThreadGroup("Universe");
		
		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();

		Thread t1=new Thread(pThreadG,obj1,"Galaxy");
		Thread t2=new Thread(pThreadG,obj2,"Planets");
		t1.start();
		t2.start();

		ThreadGroup cThreadG=new ThreadGroup(pThreadG,"Earth");

		MyThread obj3=new MyThread();
		MyThread obj4=new MyThread();

		Thread t3=new Thread(cThreadG,obj3,"Human");
		Thread t4=new Thread(cThreadG,obj4,"Animals");
		t3.start();
		t4.start();
	}
}
