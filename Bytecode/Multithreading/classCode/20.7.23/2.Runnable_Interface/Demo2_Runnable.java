// Runnable is considered as Root class in Multithreading.

class MyThread implements Runnable{
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}

class RunnableDemo2{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		//obj.start();			//error: cannot find symbol
		//It is present at Thread class.

		Thread t=new Thread(obj);	//Thread(Runnable target)
		System.out.println(Thread.currentThread().getName());
	}
}
