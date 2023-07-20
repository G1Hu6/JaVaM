class Demo extends Thread{
	public void run(){
		System.out.println("Demo ="+Thread.currentThread().getName());

		for(int i=0;i<10;i++){
			System.out.println("In run Demo");
		}
	}
}

class MyThread extends Thread{
	public void run(){
		System.out.println("MyThraed ="+Thread.currentThread().getName());

		Demo obj=new Demo();
		obj.start();
	}
}

class ThreadDemo{
	public static void main(String[] args){
		System.out.println("Main ="+Thread.currentThread().getName());

		MyThread obj=new MyThread();
		obj.start();
	}
}

/*Main =main
MyThraed =Thread-0
Demo =Thread-1
In run Demo
In run Demo
In run Demo
In run Demo
In run Demo
In run Demo
In run Demo
In run Demo
In run Demo
In run Demo

 */
