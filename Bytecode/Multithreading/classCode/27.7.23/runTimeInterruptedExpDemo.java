class MyThread extends Thread{
	MyThread(ThreadGroup tg,String s){
		super(tg,s);
	}
	
	public void run(){
		System.out.println(Thread.currentThread());
		/*try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}*/
	}
}

class TG_interruoedDemo{
	public static void main(String[] args){
		ThreadGroup pThreadG=new ThreadGroup("India");
		MyThread t1=new MyThread(pThreadG,"Maharashtra");
		MyThread t2=new MyThread(pThreadG,"UP");
		t1.start();
		t2.start();

		ThreadGroup cThreadG=new ThreadGroup(pThreadG,"Pakistan");
		MyThread t3=new MyThread(cThreadG,"karachi");
		MyThread t4=new MyThread(cThreadG,"Lahore");
		t3.start();
		t4.start();

		//pThreadG.interrupt();	//4 Exp
		//cThreadG.interrupt();	//2 Exp

		t1.interrupt();		//only t1 Thread shoud throws exception
		//all Threads under ThreadGroup "India" can throws InterruptedException at RunTime.
	}
}
