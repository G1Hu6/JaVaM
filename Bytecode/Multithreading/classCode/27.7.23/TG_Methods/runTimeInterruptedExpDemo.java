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

/*
public void interrupt()
Interrupts this thread.

Unless the current thread is interrupting itself, which is always permitted, the checkAccess method of this thread is invoked, which may cause a SecurityException to be thrown.

If this thread is blocked in an invocation of the wait(), wait(long), or wait(long, int) methods of the Object class, or of the join(), join(long), join(long, int), sleep(long), or sleep(long, int) methods of this class, then its interrupt status will be cleared and it will receive an InterruptedException.

If this thread is blocked in an I/O operation upon an InterruptibleChannel then the channel will be closed, the thread's interrupt status will be set, and the thread will receive a ClosedByInterruptException.

If this thread is blocked in a Selector then the thread's interrupt status will be set and it will return immediately from the selection operation, possibly with a non-zero value, just as if the selector's wakeup method were invoked.

If none of the previous conditions hold then this thread's interrupt status will be set.

Interrupting a thread that is not alive need not have any effect.

Implementation Note:
    In the JDK Reference Implementation, interruption of a thread that is not alive still records that the interrupt request was made and will report it via interrupted and isInterrupted().
Throws:
    SecurityException - if the current thread cannot modify this thread 
*/
