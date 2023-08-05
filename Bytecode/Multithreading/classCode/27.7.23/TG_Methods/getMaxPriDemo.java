/*
public final int getMaxPriority()
Returns the maximum priority of this thread group. Threads that are part of this group cannot have a higher priority than the maximum priority.

Returns:
    the maximum priority that a thread in this thread group can have.
Since:
    1.0
*/
class MyThread extends Thread{
	static Thread th=null;
	MyThread(ThreadGroup tg,String s){
		super(tg,s);
	}

	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(1000);
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}

class TGPriDemo{
	public static void main(String[] args){
		MyThread.th=Thread.currentThread();
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

		System.out.println(pThreadG.getMaxPriority());
		
		//pThreadG.setMaxPriority(-5);		//If the priority argument is less than MIN_Priority or greater than MAX_Priority them maxPriority of ThreadGroup remains unchanged.
		pThreadG.setMaxPriority(1);

		System.out.println(pThreadG.getMaxPriority());
		System.out.println(cThreadG.getMaxPriority());
	}
}
