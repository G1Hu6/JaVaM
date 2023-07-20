class MyThread extends Thread{
	public void run(){
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		t.setPriority(-2);
		/*
		 Exception in thread "Thread-1" java.lang.IllegalArgumentException
	at java.lang.Thread.setPriority(Thread.java:1094)
	at MyThread.run(Demo4_Priority.java:5)

		 */
	}
}

class ThreadDemo{
	public static void main(String[] args){
	
		Thread t=Thread.currentThread();
		System.out.println(t.getPriority());
	      
	      	MyThread obj=new MyThread();
		obj.start();

		//t.setPriority(11);
		t.setPriority(7);

                MyThread obj1=new MyThread();
                obj1.start();
	}
}
