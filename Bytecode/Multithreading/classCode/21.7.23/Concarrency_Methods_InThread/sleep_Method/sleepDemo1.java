class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread());
		for(int i=0;i<10;i++){
			System.out.println("In Thread-0");
		}
	}
}
class ThreadDemo1{
	public static void main(String[] args){
		System.out.println(Thread.currentThread());

		MyThread obj=new MyThread();
		obj.start();

		Thread.currentThread().setName("Core2Web");	//Changing main thread name to Core2Web.
		System.out.println(Thread.currentThread());
	}
}
