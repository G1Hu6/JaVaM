// yield() method is Request to the Thread shedular and it may or may not be accepted by JVM.
// It is operated for some quantom of Time.
// yield is not native method by old compiler.

class MyThread extends Thread{
	static Thread nmMain =null;
	public void run(){
		nmMain.yield();
		System.out.println(Thread.currentThread().getName());
	}
}

class Demo1{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		obj.start();
		MyThread.nmMain=Thread.currentThread();

		obj.yield();

		System.out.println(Thread.currentThread().getName());
	}
}
