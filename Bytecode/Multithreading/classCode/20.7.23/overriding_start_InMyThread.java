class MyThraed extends Thread{
	public void run(){
		System.out.println("In run");
	}

	void start(){		//error: start() in MyThread cannot override start() in Thread
				//attempting to assign weaker access privileges; was public					
		System.out.println("In MyThread start");
	}
}

class ThreadDemo2{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		obj.start();

		System.out.println(Thread.currentThread().getName());	//main
	}
}
