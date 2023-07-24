class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
		for(int i=0;i<10;i++){
			System.out.println("In Thread-0");
		}
	}
}
class ThreadDemo1{
	public static void main(String[] args)throws InterruptedException{
		System.out.println(Thread.currentThread());

		MyThread obj=new MyThread();
		obj.start();
		
		//Thread.sleep(-100);
		/*
		 Exception in thread "main" java.lang.IllegalArgumentException: timeout value is negative
	at java.base/java.lang.Thread.sleep(Native Method)
	at ThreadDemo1.main(sleepParameterDemo.java:16)

		 */

		// Thread.sleep(1000,-2);
		 /*
		  Exception in thread "main" java.lang.IllegalArgumentException: nanosecond timeout value out of range
		 at java.base/java.lang.Thread.sleep(Thread.java:329)

		 at ThreadDemo1.main(sleepParameterDemo.java:24)

		  */
		Thread.sleep(1000,60);
	}
}
