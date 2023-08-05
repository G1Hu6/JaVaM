class MyThread extends Thread{
        MyThread(ThreadGroup tg){	//no sutable constructor
		super(tg);
	}
}

class Demo1{
        public static void main(String[] args){
                ThreadGroup pthreadGP=new ThreadGroup("Core2Web");

                //MyThread obj1=new MyThread();
                //System.out.println(obj1.getThreadGroup());    //java.lang.ThreadGroup[name=main,maxpri=10]

                MyThread obj1=new MyThread(pthreadGP);          // error: constructor MyThread in class MyThread cannot be applied to given types;
                System.out.println(obj1.getThreadGroup());

        }
}

/*
 error: no suitable constructor found for Thread(ThreadGroup)
		super(tg);
		^
    constructor Thread.Thread(Runnable) is not applicable
      (argument mismatch; ThreadGroup cannot be converted to Runnable)
    constructor Thread.Thread(String) is not applicable
      (argument mismatch; ThreadGroup cannot be converted to String)
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output

 */
