class Demo{
	//200 methods
}

//class MyThread implements Runnable extends Demo{		//error: '{' expected
  class MyThread extends Demo implements Runnable{
	public void run(){
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
	}
}
class RunnableDemo2{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		Thread t=new Thread(obj);	//Thread(Runnable target)

		System.out.println(Thread.currentThread().getName());
	}
}
