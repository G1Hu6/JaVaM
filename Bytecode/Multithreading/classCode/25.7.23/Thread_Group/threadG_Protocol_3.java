class MyThread extends Thread{
	public void run(){
		System.out.println(getName());
		System.out.println(Thread.currentThread().getThreadGroup());
	}
}

class TGDemo3{
	public static void main(String[] args){
		MyThread obj=new MyThread("PQR");		//error: constructor MyThread in class MyThread cannot be applied to given types;
		obj.start();

		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
