class MyThread implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}

class MyThreadDemo{
	public static void main(String[] args){
		MyThread obj1 = new MyThread();
		MyThread obj2 = new MyThread();

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();
	}
}
