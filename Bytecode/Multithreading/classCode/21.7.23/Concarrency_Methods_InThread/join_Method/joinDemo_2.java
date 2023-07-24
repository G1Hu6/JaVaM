class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In run");
		}
	}
}

class ThreadDemo1{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		obj.start();
		
		obj.join();		//thread main stops until the thread-0 execute its task.			
					//unreported exception InterruptedException; must be caught or declared to be thrown.

		for(int i=0;i<10;i++){
                        System.out.println("In main");
                }
	}
}
