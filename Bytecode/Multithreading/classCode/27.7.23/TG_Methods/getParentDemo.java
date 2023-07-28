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

class TGParDemo{
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

		new SecurityManager().checkAccess(pThreadG);
		System.out.println(pThreadG.getParent());	
		//java.lang.ThreadGroup[name=main,maxpri=10]
								
		//java.lang.ThreadGroup[name=India,maxpri=10]
		System.out.println(cThreadG.getParent());

	}
}
