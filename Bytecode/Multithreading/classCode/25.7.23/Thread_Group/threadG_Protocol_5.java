/*
class MyThread extends Thread{
        MyThread(String msg){
		super(msg);                
	}

        public void run(){
                System.out.println(getName());
                System.out.println(Thread.currentThread().getThreadGroup());
        }
}

class TGDemo3{
        public static void main(String[] args){
                MyThread obj=new MyThread("PQR");
                obj.start();

                System.out.println(Thread.currentThread().getThreadGroup());
        }
}


/* 
java.lang.ThreadGroup[name=main,maxpri=10]
PQR
java.lang.ThreadGroup[name=main,maxpri=10]
*/


class MyThread extends Thread{
        MyThread(String msg){
                super(msg);
        }

        public void run(){
                System.out.println(getName());
                System.out.println(Thread.currentThread().getThreadGroup());
        }
}

class TGDemo3{
        public static void main(String[] args){
                MyThread obj=new MyThread("PQR");
                obj.start();

		MyThread obj1=new MyThread("PQR");			//Two Threads having same name are allowed
                obj1.start();
		MyThread obj2=new MyThread("LMN");                      //Two Threads having same name are allowed
                obj2.start();

                System.out.println(Thread.currentThread().getThreadGroup());
        }
}

