class MyThread extends Thread{
	public void run(){
		System.out.println(getThreadGroup());		//thread-0

		System.out.println(Thread.currentThread().getName());		//java.lang.ThreadGroup[name=main,maxpri=10]
	}
}
class TGDemo1{
	public static void main(String[] args){
		MyThread obj=new MyThread();
		obj.start();

		System.out.println(obj.getName());	//thread-0
		//System.out.println(obj.getThreadGroup());	//java.lang.ThreadGroup[name=main,maxpri=10]

		System.out.println(Thread.currentThread().getThreadGroup());	//main(Thread Group)
	}
}
