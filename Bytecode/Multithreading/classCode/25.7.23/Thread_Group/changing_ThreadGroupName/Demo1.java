class MyThread extends Thread{
	//Here we cannot catch object of ThreadGroup
}

class Demo1{
	public static void main(String[] args){
		ThreadGroup pthreadGP=new ThreadGroup("Core2Web");
		
		//MyThread obj1=new MyThread();
		//System.out.println(obj1.getThreadGroup());    //java.lang.ThreadGroup[name=main,maxpri=10]
		
		MyThread obj1=new MyThread(pthreadGP);		// error: constructor MyThread in class MyThread cannot be applied to given types;
                System.out.println(obj1.getThreadGroup());
		
	}
}
