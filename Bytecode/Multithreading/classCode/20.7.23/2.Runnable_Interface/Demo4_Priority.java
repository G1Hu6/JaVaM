class MyThread extends Thread{
	public void run(){
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		//t.setPriority(-2);
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
		System.out.println(t);
	      
	      	MyThread obj=new MyThread();
		obj.start();

		//t.setPriority(11);
		/*
		 Exception in thread "main" Thread-0 java.lang.IllegalArgumentException
			at java.lang.Thread.setPriority(Thread.java:1094)
			at ThreadDemo.main(Demo4_Priority.java:23)
		 */
		t.setPriority(7);

                MyThread obj1=new MyThread();
                obj1.start();
	}
}
