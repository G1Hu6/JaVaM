class MyThread extends Thread{
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}

class RunnableDemo2{
	public static void main(String[] args){
		MyThread t=new MyThread();

		t.start();

		t.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}
/*
 Exception in thread "main" java.lang.IllegalThreadStateException
In run	at java.lang.Thread.start(Thread.java:710)
	at RunnableDemo2.main(Demo5_Priority.java:14)

Thread-0

 */
