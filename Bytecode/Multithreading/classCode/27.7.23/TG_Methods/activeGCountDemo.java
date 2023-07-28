/*public int activeCount()

Returns an estimate of the number of active threads in this thread group and its subgroups. Recursively iterates over all subgroups in this thread group.

The value returned is only an estimate because the number of threads may change dynamically while this method traverses internal data structures, and might be affected by the presence of certain system threads. This method is intended primarily for debugging and monitoring purposes.

Returns:
    an estimate of the number of active threads in this thread group and in any other thread group that has this thread group as an ancestor
Since:
    1.0 


/*public int activeGroupCount()

Returns an estimate of the number of active groups in this thread group and its subgroups. Recursively iterates over all subgroups in this thread group.

The value returned is only an estimate because the number of thread groups may change dynamically while this method traverses internal data structures. This method is intended primarily for debugging and monitoring purposes.

Returns:
    the number of active thread groups with this thread group as an ancestor
Since:
    1.0 
/*
*/
class MyThread extends Thread{
	static Thread th=null;
	MyThread(ThreadGroup tg,String s){
		super(tg,s);
	}
	
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			//Thread.sleep(1000);
			th.join();
		}catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}

class TGactiveCntDemo{
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

		System.out.println("Total activeThread of India =" + pThreadG.activeCount());
		System.out.println("Total activeThread of Pak =" + cThreadG.activeCount());
		System.out.println(pThreadG.activeGroupCount());
		System.out.println(cThreadG.activeGroupCount());
	}
}
