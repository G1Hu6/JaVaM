class MyThread extends Thread{
	void fun(){
	
	}

	void gun(){
	
	}

	public void run(){
		System.out.println(Thread.currentThread());	
	}
}
class ThreadDemo{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		obj.start();			//This method can call internally start(0) which is native method.
						//Actually JVM does not create Thread it can uses third party library.
	}
}

/*
 * Before Java Version 1.19:

Thread[Thread-0,5,main]

 * After Java Version 1.19:

Thread[#19,Thread-0,5,main]		//[Id,Thread Name,Priority,Thread Group]
 */

