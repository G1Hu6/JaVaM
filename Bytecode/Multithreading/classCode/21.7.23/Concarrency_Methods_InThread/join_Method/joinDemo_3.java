class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In run");
		}
	}
}

class ThreadDemo1{
	public static void main(String[] args)throws InterruptedException{
		MyThread obj=new MyThread();
		obj.start();
		
		Thread.sleep(2000);
		obj.join();		//thread main(Parent thread) stops until the thread-0(child thread) execute its task.
					//nice value
		for(int i=0;i<10;i++){
                        System.out.println("In main");
                }
	}
}
