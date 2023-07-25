class MyThread extends Thread{
	//constructor having two parameters 
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}

	public void run(){
		System.out.println(Thread.currentThread());
	}
}

class Demo1{
	public static void main(String[] args){
		ThreadGroup pthreadGP=new ThreadGroup("Core2Web");

		MyThread obj1=new MyThread(pthreadGP,"Cpp");
		MyThread obj2=new MyThread(pthreadGP,"Java");
		MyThread obj3=new MyThread(pthreadGP,"Python");

		obj1.start();
		obj2.start();
		obj3.start();

		ThreadGroup cthreadGP=new ThreadGroup(pthreadGP,"Core2Web");

		MyThread obj4=new MyThread(cthreadGP,"SpringBoot");
                MyThread obj5=new MyThread(cthreadGP,"Flutter");
                MyThread obj6=new MyThread(cthreadGP,"ReactJS");
		
		obj4.start();
                obj5.start();
                obj6.start();
		
	}
}

/*
Thread[Cpp,5,Core2Web]
Thread[Flutter,5,Core2Web]
Thread[SpringBoot,5,Core2Web]
Thread[ReactJS,5,Core2Web]
Thread[Java,5,Core2Web]
Thread[Python,5,Core2Web]

 */
