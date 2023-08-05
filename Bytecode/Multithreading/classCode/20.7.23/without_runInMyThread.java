class MyThread extends Thread{
	
}

class ThreadDemo1{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		obj.start();

		System.out.println(Thread.currentThread().getName());	//main
	}
}
